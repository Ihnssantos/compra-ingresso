package br.com.igor.compraingresso.service;


import br.com.igor.compraingresso.model.Festa;
import br.com.igor.compraingresso.model.Ingresso;
import br.com.igor.compraingresso.model.Setor;
import org.springframework.stereotype.Service;

@Service
public class IngressoService {

    public Ingresso listarIngresso() {

        Festa festa1 = new Festa("RUA", "15:00 as 00:00", "Campo meridional");
        Ingresso ingresso1 = new Ingresso(festa1, Setor.PISTA, 80.0);

        return ingresso1;
    }
}
