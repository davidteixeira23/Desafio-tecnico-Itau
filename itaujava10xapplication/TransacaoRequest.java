package com.mycompany.itaujava10xapplication;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data // <-- Isso gera automaticamente o getValor(), setValor(), getDataHora(), etc.
@NoArgsConstructor // Cria o construtor vazio necessário para o Spring
@AllArgsConstructor // Cria o construtor com todos os atributos grt3vui
public class TransacaoRequest {
    
    // Adicione os atributos que o usuário vai enviar na requisição:
    private BigDecimal valor;
    private OffsetDateTime dataHora;
    
}
