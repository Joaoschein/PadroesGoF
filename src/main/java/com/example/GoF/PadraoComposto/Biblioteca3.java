package com.example.GoF.PadraoComposto;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca3 {
    private List<Midia2> midias;

    public Biblioteca3() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia2 midia) {
        midias.add(midia);
    }

    public void exibirBiblioteca() {
        System.out.println("Biblioteca:");
        for (Midia2 midia : midias) {
            midia.exibir();
        }
    }
}

