package com.example.GoF.PadraoObjetoUnitario;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca2 {
    private List<String> livros;

    public Biblioteca2() {
        this.livros = new ArrayList<>();
    }

    // Adiciona um livro à biblioteca
    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    // Exibe as configurações globais da biblioteca
    public void exibirConfiguracoes() {
        System.out.println(ConfiguracaoBiblioteca.getInstancia("", 0).toString());
    }
}

