package com.example.GoF.PadraoEstrategia;

import java.time.LocalDate;

public class Emprestimo2 {
    private Midia1 midia;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    public Emprestimo2(Midia1 midia, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.midia = midia;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public long calcularDiasAtraso() {
        return LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
    }

    public double calcularMulta() {
        return midia.getRegraMulta().calcularMulta(calcularDiasAtraso());
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Midia1 getMidia() {
        return midia;
    }
}
