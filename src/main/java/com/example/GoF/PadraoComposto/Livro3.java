package com.example.GoF.PadraoComposto;

public class Livro3 implements Midia2 {
    private String titulo;
    private String autor;

    public Livro3(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void exibir() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }
}