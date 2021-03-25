package com.prova.carros.Marca;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idMarca;
    public String nome;

}
