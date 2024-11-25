package com.example.GoF.PadraoFabrica;

// Classe Fábrica para criar diferentes tipos de mídias
public class FabricaMidia {
    public static Midia criarMidia(String tipo, String titulo, String autorOuEdicao) {
        if (tipo.equalsIgnoreCase("Livro")) {
            return new Livro1(titulo, autorOuEdicao); // Cria um Livro
        } else if (tipo.equalsIgnoreCase("Revista")) {
            return new Revista1(titulo, Integer.parseInt(autorOuEdicao)); // Cria uma Revista
        } else {
            throw new IllegalArgumentException("Tipo de mídia não reconhecido: " + tipo);
        }
    }
}

