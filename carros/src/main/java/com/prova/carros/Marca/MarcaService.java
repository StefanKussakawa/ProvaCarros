package com.prova.carros.Marca;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

    final MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public Marca insereMarca(Marca marca) {
        return marcaRepository.save(marca);
    }

    public List<Marca> listaMarcas() {
        return marcaRepository.findAll();
    }

    public void deletaMarcaPorId(Long id) {
        Marca marca = marcaRepository.findByIdMarca(id);
        marcaRepository.delete(marca);
    }

    public Marca editaMarca(Marca marca) {
        return marcaRepository.save(marca);
    }
}
