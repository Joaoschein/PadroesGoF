package com.example.GoF.PadraoObservador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEmprestimos extends Sujeito {
    private List<Emprestimo7> emprestimos;

    public GerenciadorDeEmprestimos() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Emprestimo7 emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + emprestimo.getUsuario().getNome());
    }

    public void verificarPrazosDevolucao() {
        for (Emprestimo7 emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() <= 3) {
                notificarObservadores(emprestimo);
            }
        }
    }
}

