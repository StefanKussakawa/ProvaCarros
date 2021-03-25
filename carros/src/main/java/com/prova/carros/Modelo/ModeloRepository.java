package com.prova.carros.Modelo;

import com.prova.carros.Marca.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {
    Modelo findByIdModelo(Long id);
    List<Modelo> findAllByMarca_Nome(String nome);
}
