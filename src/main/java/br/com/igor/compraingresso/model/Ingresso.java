package br.com.igor.compraingresso.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ingresso")
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private BigDecimal preco;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "festa_id", nullable = false)
    private Festa festa;

    public Ingresso() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Festa getFesta() {
        return festa;
    }

    public void setFesta(Festa festa) {
        this.festa = festa;
    }
}