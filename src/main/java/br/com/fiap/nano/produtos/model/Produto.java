package br.com.fiap.nano.produtos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Categoria categoria;
    private LocalDateTime dataCadastro;


    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, BigDecimal preco, Categoria categoria, LocalDateTime dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Produto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public Produto setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    @Override
    public String toString() {
        return nome;
    }
}
