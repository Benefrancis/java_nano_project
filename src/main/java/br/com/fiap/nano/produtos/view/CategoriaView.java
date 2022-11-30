package br.com.fiap.nano.produtos.view;

import br.com.fiap.nano.produtos.model.Categoria;
import br.com.fiap.nano.produtos.repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria) {
        // @formatter:off
        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null, // componente pai. Como não temos será null
                "Selecione uma categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, // icone
                repository.findAll().toArray(), // Número da opção
                categoria == null ? 1 : categoria);
        return ret;
        // @formatter:on
    }

    public static Categoria form() {
        String nome = JOptionPane.showInputDialog("Informe o nome da Categoria");
        return new Categoria(nome);
    }

    public void sucesso() {
        JOptionPane.showMessageDialog(null, "Categoria salva com sucesso!");
    }

    public void sucesso(Categoria categoria) {
        System.out.println(categoria);
        JOptionPane.showMessageDialog(null, "Categoria " + categoria.getNome().toUpperCase() + " salva com sucesso!");
    }
}
