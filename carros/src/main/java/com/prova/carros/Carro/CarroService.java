package com.prova.carros.Carro;

import com.prova.carros.Marca.Marca;
import com.prova.carros.Modelo.Modelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    final
    CarroRepository carroRepository;

    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro insereCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public List<Carro> listaCarros() {
        return carroRepository.findAll();
    }

    public List<Carro> listaCarrosPorModelo(String nome) {
        return carroRepository.findAllByModelo_Nome(nome);
    }

    public List<Carro> listaCarrosPorMarca(String nome) {
        return carroRepository.findAllByMarca_Nome(nome);
    }

    public Carro listaCarroPorPlaca(String placa) {
        return carroRepository.findByPlaca(placa);
    }

    public void deletaCarroPorId(Long id) {
        Carro carro = carroRepository.findByIdCarro(id);
        carroRepository.delete(carro);
    }

    public Carro editaCarro(Carro carro) {
        return carroRepository.save(carro);
    }
}
