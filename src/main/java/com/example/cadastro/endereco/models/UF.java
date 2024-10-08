package com.example.cadastro.endereco.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "uf")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false, unique = true)
    private String name;



//    @Column(nullable = false, unique = true)
    private String initials;


}
