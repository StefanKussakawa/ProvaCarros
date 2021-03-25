package com.prova.carros.Carro;

import com.prova.carros.Marca.Marca;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @PostMapping
    public ResponseEntity<Carro> insereCarro(@RequestBody Carro carro) {
        carroService.insereCarro(carro);
        return new ResponseEntity<>(carro, null, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Carro> listaCarros() {
        return carroService.listaCarros();
    }

    @GetMapping("/placa/{placa}")
    public Carro listaCarroPorPlaca(@PathVariable String placa) {
        return carroService.listaCarroPorPlaca(placa);
    }

    @GetMapping("/modelo/{nome}")
    public List<Carro> listaCarroPorModelo(@PathVariable String nome) {
        return carroService.listaCarrosPorModelo(nome);
    }

    @GetMapping("/marca/{nome}")
    public List<Carro> listaCarroPorMarca(@PathVariable String nome) {
        return carroService.listaCarrosPorMarca(nome);
    }

    @DeleteMapping("/{id}")
    public void deletaCarroPorId(@PathVariable Long id) {
        carroService.deletaCarroPorId(id);
    }

    @PutMapping
    public ResponseEntity<?> editaCarro(@RequestBody Carro carro) {
        carroService.editaCarro(carro);
        return new ResponseEntity<>(carro, null, HttpStatus.ACCEPTED);
    }
}
