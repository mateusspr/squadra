package com.example.cadastro.endereco.controllers;

import com.example.cadastro.endereco.dto.PersonDto;
import com.example.cadastro.endereco.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import java.util.List;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<PersonDto> saveNewPerson(@RequestBody PersonDto person){
        PersonDto personSalve = personService.saveNewPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

    @GetMapping
    public ResponseEntity<List<PersonDto>> getAllPeople(){
        List<PersonDto> personList = personService.getAllPeople();
        return ResponseEntity.ok(personList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRegister(@PathVariable Long id){
        personService.deleteRegister(id);
        return ResponseEntity.status(HttpStatus.OK).body("Register deleted successfully!");
    }
}
