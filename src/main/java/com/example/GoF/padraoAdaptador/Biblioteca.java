package com.example.GoF.padraoAdaptador;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private PagamentoAdaptador pagamentoAdaptador; // Uso do adaptador

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
        this.pagamentoAdaptador = new PagamentoAdaptador();
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Processa as multas e paga através do adaptador
    public void processarPagamentosDeMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.calcularDiasAtraso() > 0) {
                double multa = emprestimo.calcularMulta();
                pagamentoAdaptador.pagarMulta(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}

