package com.example.cadastro.endereco.repositories;

import com.example.cadastro.endereco.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
