package com.mycompany.itaujava10xapplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data // <-- Isso gera automaticamente o getValor(), setValor(), getDataHora(), etc.
@NoArgsConstructor // Cria o construtor vazio necessário para o Spring
@AllArgsConstructor // Cria o construtor com todos os atributos

public class TransacaoRequest {
    /*
    // Adicione os atributos que o usuário vai enviar na requisição:
     private BigDecimal valor;
     private OffsetDateTime dataHora;
    */


// WARNING: O BLOCO DE CÓDIGOS ABAIXO É UMA MÊDIDA PROVISORIA PARA O PROBLEMA DE @DATA QUE SE DEU NA TRANSACAOSERVICE
// ESSE FOI O UNICO PROBLEMA, PROBLEMA ESSE QUE DEVE SER RESOLVIDO EM UPLOADS FUTUROS.
private BigDecimal valor;
    private OffsetDateTime dataHora;

    // Construtor Vazio (NoArgsConstructor)
    public TransacaoRequest() {
    }

    // Construtor com todos os campos (AllArgsConstructor)
    public TransacaoRequest(BigDecimal valor, OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    // Getter para Valor
    public BigDecimal getValor() {
        return valor;
    }

    // Setter para Valor
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    // Getter para DataHora
    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    // Setter para DataHora
    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
   }
   
    
 
