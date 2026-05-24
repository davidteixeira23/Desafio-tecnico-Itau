package com.mycompany.itaujava10xapplication;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.stereotype.Service;

@Service 
public class TransacaoService {
  
    public void validarTransacao(TransacaoRequest transacaoRequest) {
        
        // 1. DATA E HORA PRESENTE (BODY NÃO PODE SER VAZIO OU NULO)
        if (transacaoRequest.getValor().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Erro: isso não é uma transação válida, transação menor que zero");
        }
        
        // CORREÇÃO: Mudado de OffsetDataTime para OffsetDateTime e removido o ";" do final
        if (transacaoRequest.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Erro: A data da transação não pode estar no futuro.");
        }
    }
}