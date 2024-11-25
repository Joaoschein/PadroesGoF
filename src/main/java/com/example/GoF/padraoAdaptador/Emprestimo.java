package com.example.GoF.padraoAdaptador;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    // Construtor
    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
    }

    // Verifica se o livro foi devolvido
    public boolean isDevolvido() {
        return devolvido;
    }

    // Define o status de devolução
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    // Calcula os dias de atraso na devolução
    public long calcularDiasAtraso() {
        if (devolvido) {
            return 0; // Não há atraso se o livro foi devolvido
        }
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        return Math.max(diasAtraso, 0); // Retorna 0 se não houver atraso
    }

    // Retorna o nome do usuário
    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    // Retorna o livro associado ao empréstimo
    public Livro getLivro() {
        return livro;
    }

    // Calcula a multa com base nos dias de atraso
    public double calcularMulta() {
        long diasAtraso = calcularDiasAtraso();
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0; // Multa de R$2,00 por dia de atraso
    }

    @Override
    public String toString() {
        return "Empréstimo do livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario +
                (devolvido ? " (devolvido)" : " (não devolvido)") +
                ", data de devolução esperada: " + dataDeDevolucao +
                ", dias de atraso: " + calcularDiasAtraso();
    }
}
