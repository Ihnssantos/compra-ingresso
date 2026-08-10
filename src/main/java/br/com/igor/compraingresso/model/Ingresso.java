package br.com.igor.compraingresso.model;

public class Ingresso {

    private String nomeFesta;
    private String horario;
    private String setor;
    private double preco;
    private String endereco;

    public Ingresso(String nomeFesta, String horario, String setor, double preco, String endereco) {
        this.nomeFesta = nomeFesta;
        this.horario = horario;
        this.setor = setor;
        this.preco = preco;
        this.endereco = endereco;
    }

    public String getNomeFesta() {
        return nomeFesta;
    }

    public String getHorario() {
        return horario;
    }

    public String getSetor() {
        return setor;
    }

    public double getPreco() {
        return preco;
    }

    public String getEndereco() {
        return endereco;
    }

}
