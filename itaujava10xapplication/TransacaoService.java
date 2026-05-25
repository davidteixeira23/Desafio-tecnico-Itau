package com.mycompany.itaujava10xapplication;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.stereotype.Service;

@Service 
public class TransacaoService {
  
    public void validarTransacao(TransacaoRequest transacaoRequest) {
        /*
        // 1. DATA E HORA PRESENTE (BODY NÃO PODE SER VAZIO OU NULO)
        if (transacaoRequest.getValor().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Erro: isso não é uma transação válida, transação menor que zero");
        }
        
        // CORREÇÃO: Mudado de OffsetDataTime para OffsetDateTime e removido o ";" do final
        if (transacaoRequest.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Erro: A data da transação não pode estar no futuro.");
          */

        // 1. VALIDAÇÃO DO VALOR (Não pode ser nulo e nem menor que zero)
        if (transacaoRequest.getValor() == null) {
            throw new IllegalArgumentException("Erro: O valor da transação não pode ser nulo.");
        }
        
        if (transacaoRequest.getValor().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Erro: isso não é uma transação válida, transação menor que zero");
        }
        
        // 2. VALIDAÇÃO DA DATA E HORA (Não pode ser nula e nem no futuro)
        if (transacaoRequest.getDataHora() == null) {
            throw new IllegalArgumentException("Erro: A data e hora da transação não podem ser nulas.");
        }
        
        if (transacaoRequest.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Erro: A data da transação não pode estar no futuro.");
        }
    }
}
