package com.example.GoF.PadraoComposto;

public class Revista3 implements Midia2 {
    private String titulo;
    private int edicao;

    public Revista3(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    @Override
    public void exibir() {
        System.out.println("Revista: " + titulo + ", Edição: " + edicao);
    }
}
