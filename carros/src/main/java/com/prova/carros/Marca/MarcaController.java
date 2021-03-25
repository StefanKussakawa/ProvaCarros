package com.prova.carros.Marca;

import com.prova.carros.Carro.Carro;
import com.prova.carros.Carro.CarroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    public ResponseEntity<Marca> insereMarca(@RequestBody Marca marca) {
        marcaService.insereMarca(marca);
        return new ResponseEntity<>(marca, null, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Marca> listaMarcas() {
        return marcaService.listaMarcas();
    }

    @DeleteMapping("/{id}")
    public void deletaMarcaPorId(@PathVariable Long id) {
        marcaService.deletaMarcaPorId(id);
    }

    @PutMapping
    public ResponseEntity<?> editaMarca(@RequestBody Marca marca) {
        marcaService.editaMarca(marca);
        return new ResponseEntity<>(marca, null, HttpStatus.ACCEPTED);
    }
}
