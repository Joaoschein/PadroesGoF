package com.example.GoF.PadraoFachada;

import java.time.LocalDate;

public class BibliotecaFacade {
    /*private GerenciadorDeLivros gerenciadorDeLivros;
    private GerenciadorDeRevistas gerenciadorDeRevistas;
    private GerenciadorDeEmprestimos gerenciadorDeEmprestimos;
    private CalculadoraDeMultas calculadoraDeMultas;

    public BibliotecaFacade() {
        this.gerenciadorDeLivros = new GerenciadorDeLivros();
        this.gerenciadorDeRevistas = new GerenciadorDeRevistas();
        this.gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();
        this.calculadoraDeMultas = new CalculadoraDeMultas();
    }

    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        gerenciadorDeLivros.adicionarLivro(livro);
    }

    public void adicionarRevista(String titulo, int edicao) {
        Revista revista = new Revista(titulo, edicao);
        gerenciadorDeRevistas.adicionarRevista(revista);
    }

    public void registrarEmprestimoLivro(String usuario, String titulo, LocalDate dataDeDevolucao) {
        Livro livro = gerenciadorDeLivros.getLivros().stream()
                .filter(l -> l.getTitulo().equals(titulo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Livro não encontrado: " + titulo));
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataDeDevolucao);
        gerenciadorDeEmprestimos.registrarEmprestimo(emprestimo);
    }

    public void calcularMultas() {
        for (Emprestimo emprestimo : gerenciadorDeEmprestimos.getEmprestimos()) {
            double multa = calculadoraDeMultas.calcularMulta(emprestimo);
            if (multa > 0) {
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }*/
}

