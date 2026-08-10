package br.com.igor.compraingresso.model;

public class Ingresso {

    private Festa festa;
    private Setor setor;
    private double preco;

    public Ingresso(Festa festa, Setor setor, double preco) {
        this.festa = festa;
        this.setor = setor;
        this.preco = preco;
    }

    public Festa getFesta() {
        return festa;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getPreco() {
        return preco;
    }

}
