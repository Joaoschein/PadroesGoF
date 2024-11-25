package com.example.GoF.padraoAdaptador;

// Adaptador para o serviço de pagamento
public class PagamentoAdaptador {
    private ServicoPagamentoExterno servicoPagamento;

    public PagamentoAdaptador() {
        this.servicoPagamento = new ServicoPagamentoExterno();
    }

    // Método adaptado para processar pagamentos
    public void pagarMulta(String nomeUsuario, double valor) {
        // Transforma o nome do usuário em identificador esperado pelo serviço
        String identificador = "Usuario-" + nomeUsuario;
        servicoPagamento.pagarFatura(identificador, valor);
    }
}