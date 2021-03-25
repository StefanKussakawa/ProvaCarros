package com.prova.carros.Carro;

import com.prova.carros.Marca.Marca;
import com.prova.carros.Modelo.Modelo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCarro;
    public String placa;
    @ManyToOne
    public Marca marca;
    @ManyToOne
    public Modelo modelo;

}
