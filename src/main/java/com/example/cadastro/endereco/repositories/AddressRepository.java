package com.example.cadastro.endereco.repositories;

import com.example.cadastro.endereco.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
