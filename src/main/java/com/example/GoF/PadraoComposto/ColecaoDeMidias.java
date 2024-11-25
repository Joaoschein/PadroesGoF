package com.example.GoF.PadraoComposto;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeMidias implements Midia2 {
    private String nome;
    private List<Midia2> midias;

    public ColecaoDeMidias(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia2 midia) {
        midias.add(midia);
    }

    @Override
    public void exibir() {
        System.out.println("Coleção: " + nome);
        for (Midia2 midia : midias) {
            midia.exibir();
        }
    }
}

