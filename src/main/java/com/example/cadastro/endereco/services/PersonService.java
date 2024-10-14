package com.example.cadastro.endereco.services;

import com.example.cadastro.endereco.dto.PersonDto;
import com.example.cadastro.endereco.models.Person;
import com.example.cadastro.endereco.repositories.PersonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import java.util.List;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public PersonDto saveNewPerson(PersonDto personDto){
        Person person = modelMapper.map(personDto, Person.class);
        Person newPerson = personRepository.save(person);
        return modelMapper.map(newPerson, PersonDto.class);
    }

    public List<PersonDto> getAllPeople(){
        return personRepository.findAll().stream()
                .map(person -> modelMapper.map(person, PersonDto.class))
                .collect(Collectors.toList());
    }

    @Transactional
    public void deleteRegister(Long id){
        personRepository.deleteById(id);
    }
}
