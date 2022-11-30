package br.com.fiap.nano.produtos;

import br.com.fiap.nano.produtos.repository.CategoriaCollectionRepository;
import br.com.fiap.nano.produtos.repository.ProdutoCollectionRepository;

public class Main {
    public static void main(String[] args) {

        CategoriaCollectionRepository.findAll().forEach(System.out::println);

        ProdutoCollectionRepository.findAll().forEach(System.out::println);

    }
}