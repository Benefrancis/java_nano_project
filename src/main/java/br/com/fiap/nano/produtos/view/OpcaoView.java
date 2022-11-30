package br.com.fiap.nano.produtos.view;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class OpcaoView {

    public static Opcao select() {
        // @formatter:off
        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, // componente pai. Como não temos será null
                "Selecione uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, // icone
                Opcao.values(), // Número da opção
                Opcao.CADASTRAR_PRODUTO);

        return ret != null ? ret : Opcao.ENCERRAR_SISTEMA;
        // @formatter:on
    }
}

enum Opcao {

    CADASTRAR_CATEGORIA(1, "Cadastrar Categoria"),
    CADASTRAR_PRODUTO(2, "Cadastrar Produto"),
    ALTERAR_PRODUTO(3, "Alterar dados do Produto"),
    CONSULTAR_PRODUTO_POR_ID(4, "Consultar Produto Por ID"),
    CONSULTAR_PRODUTO_POR_CATEGORIA(5, "Consultar Produto Por Categoria"),
    ENCERRAR_SISTEMA(6, "Encerrar Sistema");

    private String nome;
    private int id;

    Opcao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Opcao> getList() {
        return Arrays.asList(Opcao.values());
    }

    @Override
    public String toString() {
        return nome;
    }
}