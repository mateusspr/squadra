package com.example.cadastro.endereco.services;

import com.example.cadastro.endereco.models.Person;
import com.example.cadastro.endereco.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

    public List<Person> personList(){
        return personRepository.findAll();
    }
}
