package com.prova.carros.Modelo;

import com.prova.carros.Marca.Marca;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idModelo;
    public String nome;
    @ManyToOne
    public Marca marca;

}
