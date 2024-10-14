package com.example.cadastro.endereco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDto {

    private String street;

    private String number;

    private String type;

    private String neighborhood;

    private String municipality;
}
