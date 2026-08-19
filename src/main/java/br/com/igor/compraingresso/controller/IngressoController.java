package br.com.igor.compraingresso.controller;

import br.com.igor.compraingresso.model.Ingresso;
import br.com.igor.compraingresso.service.IngressoService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController //indica que essa classe é um controlador REST
public class IngressoController {

    private IngressoService ingressoService;

    public IngressoController(IngressoService ingressoService) {
        this.ingressoService = ingressoService;
    }

    @GetMapping("/ingressos")
    public List<Ingresso> listaIngressos() {
        return ingressoService.listarIngresso();
    }
}

