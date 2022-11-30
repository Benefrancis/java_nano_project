package br.com.fiap.nano.produtos.model;

public class Categoria {
    private Long id;
    private String nome;


    public Categoria() {
    }

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Long getId() {
        return id;
    }

    public Categoria setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return getNome();
    }


}
