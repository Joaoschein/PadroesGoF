package com.example.GoF.PadraoEstrategia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca2 {
    private List<Emprestimo2> emprestimos;

    public Biblioteca2() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Midia1 midia, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo2 emprestimo = new Emprestimo2(midia, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + nomeDoUsuario);
    }

    public void calcularMultas() {
        for (Emprestimo2 emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                if (multa > 0) {
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
                }
            }
        }
    }
}

