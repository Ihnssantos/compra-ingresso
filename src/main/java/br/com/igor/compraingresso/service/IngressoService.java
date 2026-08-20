package br.com.igor.compraingresso.service;

import br.com.igor.compraingresso.model.Ingresso;
import br.com.igor.compraingresso.repository.IngressoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngressoService {

    private final IngressoRepository repository;

    public IngressoService(IngressoRepository repository) {
        this.repository = repository;
    }

    public List<Ingresso> listar() {
        return repository.findAll();
    }
}