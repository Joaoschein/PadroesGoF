package com.example.GoF.PadraoFabrica;

// Classe Livro que implementa Midia
public class Livro1 implements Midia {
    private String titulo;
    private String autor;

    public Livro1(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}
