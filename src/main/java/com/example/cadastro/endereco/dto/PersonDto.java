package com.example.cadastro.endereco.dto;

import com.example.cadastro.endereco.models.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonDto {

    private String name;
    private List<Address> addresses;

}
