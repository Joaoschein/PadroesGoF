package com.example.GoF.padraoAdaptador;

// Simula o serviço de pagamento externo
public class ServicoPagamentoExterno {

    // Método para processar o pagamento de uma fatura
    public void pagarFatura(String identificador, double valor) {
        // Simulação de processamento do pagamento
        System.out.println("Pagamento de R$ " + valor + " processado para o identificador: " + identificador);
    }
}

