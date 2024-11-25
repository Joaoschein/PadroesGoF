package com.example.GoF.PadraoFabrica;

// Classe Revista que implementa Midia
public class Revista1 implements Midia {
    private String titulo;
    private int edicao;

    public Revista1(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    @Override
    public String getDescricao() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}
