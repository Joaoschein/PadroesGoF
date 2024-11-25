package com.example.GoF.PadraoFabrica;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca1 {
    private List<Midia> midias;

    public Biblioteca1() {
        this.midias = new ArrayList<>();
    }

    // Adiciona uma mídia usando a fábrica
    public void adicionarMidia(String tipo, String titulo, String autorOuEdicao) {
        try {
            Midia midia = FabricaMidia.criarMidia(tipo, titulo, autorOuEdicao);
            midias.add(midia);
            System.out.println(tipo + " adicionado: " + titulo);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Exibe todas as mídias
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia.getDescricao());
        }
    }
}

