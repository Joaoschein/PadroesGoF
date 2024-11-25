package com.example.GoF.PadraoEstrategia;

// Regra para livros
public class RegraMultaLivro implements RegraMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}

