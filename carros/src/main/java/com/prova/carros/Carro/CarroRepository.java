package com.prova.carros.Carro;

import com.prova.carros.Marca.Marca;
import com.prova.carros.Modelo.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro> findAllByModelo_Nome(String nome);
    List<Carro> findAllByMarca_Nome(String nome);
    Carro findByPlaca(String placa);
    Carro findByIdCarro(Long id);
}
