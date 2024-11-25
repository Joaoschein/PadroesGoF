package com.example.GoF.PadraoEstrategia;

// Implementação para Livro
public class Livro2 implements Midia1 {
    private String titulo;
    private String autor;

    public Livro2(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public RegraMulta getRegraMulta() {
        return new RegraMultaLivro();
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}
