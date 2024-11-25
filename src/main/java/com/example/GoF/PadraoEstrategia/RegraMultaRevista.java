package com.example.GoF.PadraoEstrategia;

// Regra para revistas
public class RegraMultaRevista implements RegraMulta {
    @Override
    public double calcularMulta(long diasAtraso) {
        return diasAtraso > 0 ? diasAtraso * 1.0 : 0.0;
    }
}