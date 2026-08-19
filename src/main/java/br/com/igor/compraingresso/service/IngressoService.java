package br.com.igor.compraingresso.service;


import br.com.igor.compraingresso.model.Ingresso;
import org.springframework.stereotype.Service;
import br.com.igor.compraingresso.repository.IngressoRepository;
import java.util.List;

@Service
public class IngressoService {

    private IngressoRepository ingressoRepository;

    public IngressoService(IngressoRepository ingressoRepository) {
        this.ingressoRepository = ingressoRepository;
    }

    public List<Ingresso> listarIngresso() {

        return ingressoRepository.findAll();
    }
}
