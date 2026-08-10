package br.com.igor.compraingresso.model;

public class teste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Igor", 17, 100.0);

        Festa festa1 = new Festa("RUA", "15:00 as 00:00", "Campo meridional");

        Ingresso ingresso1 = new Ingresso(festa1, Setor.PISTA, 80.0);

        Compra compra1 = new Compra(pessoa1, ingresso1);

        compra1.realizarCompra();

        System.out.println(pessoa1.getSaldo());

        compra1.cancelarCompra();

        System.out.println(pessoa1.getSaldo());
    }
}
