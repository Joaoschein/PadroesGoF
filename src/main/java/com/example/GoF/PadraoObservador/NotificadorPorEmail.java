package com.example.GoF.PadraoObservador;

public class NotificadorPorEmail implements Observador {
    @Override
    public void atualizar(Emprestimo7 emprestimo) {
        Usuario usuario = emprestimo.getUsuario();
        System.out.println("Enviando e-mail para " + usuario.getEmail() +
                ": Lembrete - devolução do livro \"" + emprestimo.getLivro().getTitulo() +
                "\" está próxima!");
    }
}

