package br.com.igor.compraingresso.model;

public class Pessoa {

    private String nome;
    private int idade;
    private double saldo;

    public Pessoa(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.saldo = saldo;
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

    public boolean removerSaldo(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean maiorIdade() {
        return idade >= 18;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldo() {
        return saldo;
    }
}
