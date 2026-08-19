package br.com.igor.compraingresso.repository;

import br.com.igor.compraingresso.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngressoRepository extends JpaRepository<Ingresso, Integer> {
}
