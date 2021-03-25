package com.prova.carros.Modelo;

import com.prova.carros.Marca.Marca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {

    final ModeloRepository modeloRepository;

    @Autowired
    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public Modelo insereModelo(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    public List<Modelo> listaModelos() {
        return modeloRepository.findAll();
    }

    public void deletaModeloPorId(Long id) {
        Modelo modelo = modeloRepository.findByIdModelo(id);
        modeloRepository.delete(modelo);
    }

    public Modelo editaModelo(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    public List<Modelo> listaModelosPorMarca(String nome) {
        return modeloRepository.findAllByMarca_Nome(nome);
    }
}
