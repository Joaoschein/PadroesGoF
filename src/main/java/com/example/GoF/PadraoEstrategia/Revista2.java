package com.example.GoF.PadraoEstrategia;

// Implementação para Revista
public class Revista2 implements Midia1 {
    private String titulo;
    private int edicao;

    public Revista2(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public RegraMulta getRegraMulta() {
        return new RegraMultaRevista();
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}
