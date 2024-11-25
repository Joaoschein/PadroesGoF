package com.example.GoF.padraoAdaptador;

public class Livro {
    private String titulo;
    private String autor;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Retorna o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Retorna o autor do livro
    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}

