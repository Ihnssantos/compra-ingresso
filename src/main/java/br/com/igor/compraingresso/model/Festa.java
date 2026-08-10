package br.com.igor.compraingresso.model;

public class Festa {

    private String nome;
    private String horario;
    private String endereco;

    public Festa(String nome, String horario, String endereco) {
        this.nome = nome;
        this.horario = horario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public String getEndereco() {
        return endereco;
    }
}
