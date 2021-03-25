package com.prova.carros.Modelo;

import com.prova.carros.Carro.Carro;
import com.prova.carros.Marca.Marca;
import com.prova.carros.Marca.MarcaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    final ModeloService modeloService;

    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @PostMapping
    public ResponseEntity<Modelo> insereModelo(@RequestBody Modelo modelo) {
        modeloService.insereModelo(modelo);
        return new ResponseEntity<>(modelo, null, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Modelo> listaModelos() {
        return modeloService.listaModelos();
    }

    @GetMapping("/marca/{nome}")
    public List<Modelo> listaModeloPorMarca(@PathVariable String nome) {
        return modeloService.listaModelosPorMarca(nome);
    }

    @DeleteMapping("/{id}")
    public void deletaModeloPorId(@PathVariable Long id) {
        modeloService.deletaModeloPorId(id);
    }

    @PutMapping
    public ResponseEntity<?> editaModelo(@RequestBody Modelo modelo) {
        modeloService.editaModelo(modelo);
        return new ResponseEntity<>(modelo, null, HttpStatus.ACCEPTED);
    }
}
