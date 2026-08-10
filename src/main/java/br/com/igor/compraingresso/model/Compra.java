package br.com.igor.compraingresso.model;

public class Compra {
     private Pessoa pessoa;
     private Ingresso ingresso;

    public Compra(Pessoa pessoa, Ingresso ingresso) {
        this.pessoa = pessoa;
        this.ingresso = ingresso;
    }

    public boolean realizarCompra() {
        if (ingresso.getSetor().equals("VIP") || ingresso.getSetor().equals("OPEN BAR")) {
            if (!pessoa.maiorIdade()) {
                return false;
            } else {
                return pessoa.removerSaldo(ingresso.getPreco());
            }
        } else {
            return pessoa.removerSaldo(ingresso.getPreco());
        }
    }

    public void cancelarCompra() {
        pessoa.adicionarSaldo(ingresso.getPreco());
    }

    public boolean verificarSetor() {
        if (ingresso.getSetor().equals("VIP") || ingresso.getSetor().equals("OPEN BAR")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarSaldo() {
        if (pessoa.getSaldo() >= ingresso.getPreco()) {
            return true;
        } else {
            return false;
        }
    }
}
