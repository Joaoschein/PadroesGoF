package com.example.GoF.PadraoObservador;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujeito {
    private List<Observador> observadores = new ArrayList<>();

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(Emprestimo7 emprestimo) {
        for (Observador observador : observadores) {
            observador.atualizar(emprestimo);
        }
    }
}

