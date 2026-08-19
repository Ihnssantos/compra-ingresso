package br.com.igor.compraingresso.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@Entity
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Festa festa;

    private Setor setor;
    private double preco;

    public Ingresso(){}

    public Ingresso(Festa festa, Setor setor, double preco) {
        this.festa = festa;
        this.setor = setor;
        this.preco = preco;
    }

    public Festa getFesta() {
        return festa;
    }

    public int getId() {
        return id;
    }

    public Setor getSetor() {

        return setor;
    }

    public double getPreco() {

        return preco;
    }

}
