package br.com.igor.compraingresso.controller;

import br.com.igor.compraingresso.model.Ingresso;
import br.com.igor.compraingresso.repository.IngressoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingressos")
@CrossOrigin
public class IngressoController {

    private final IngressoRepository repository;

    public IngressoController(IngressoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Ingresso> listarIngressos() {
        return repository.findAll();
    }
}