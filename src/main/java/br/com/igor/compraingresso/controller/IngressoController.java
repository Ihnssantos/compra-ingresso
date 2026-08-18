package br.com.igor.compraingresso.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController //indica que essa classe é um controlador REST
public class IngressoController {

    @GetMapping("/ingressos")
    public String listaIngressos() {
        return "Lista de ingressos";
    }
}
