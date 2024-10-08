package com.example.cadastro.endereco.controllers;

import com.example.cadastro.endereco.dto.PersonDto;
import com.example.cadastro.endereco.models.Person;
import com.example.cadastro.endereco.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person){
        Person personSalve = personService.save(person);
        return ResponseEntity.ok(personSalve);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAllPeople(){
        List<Person> personList = personService.personList();
        return ResponseEntity.ok(personList);
    }
}
