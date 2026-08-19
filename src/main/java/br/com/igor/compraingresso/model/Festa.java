package br.com.igor.compraingresso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Festa {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String horario;
    private String endereco;

    public Festa() {}

    public Festa(String nome, String horario, String endereco) {
        this.nome = nome;
        this.horario = horario;
        this.endereco = endereco;
    }

    public int getId() { return id; }

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
