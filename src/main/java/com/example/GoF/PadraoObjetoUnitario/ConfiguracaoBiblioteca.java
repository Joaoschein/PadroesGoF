package com.example.GoF.PadraoObjetoUnitario;

public class ConfiguracaoBiblioteca {
    private String horariosDeFuncionamento;
    private double valorMultaDiaria;

    // Instância única estática
    private static ConfiguracaoBiblioteca instancia;

    // Construtor privado para evitar criação direta
    private ConfiguracaoBiblioteca(String horariosDeFuncionamento, double valorMultaDiaria) {
        this.horariosDeFuncionamento = horariosDeFuncionamento;
        this.valorMultaDiaria = valorMultaDiaria;
    }

    // Método estático para obter a instância única
    public static ConfiguracaoBiblioteca getInstancia(String horarios, double multa) {
        if (instancia == null) {
            instancia = new ConfiguracaoBiblioteca(horarios, multa);
        }
        return instancia;
    }

    public String getHorariosDeFuncionamento() {
        return horariosDeFuncionamento;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    @Override
    public String toString() {
        return "Horários: " + horariosDeFuncionamento + ", Multa Diária: R$ " + valorMultaDiaria;
    }
}

