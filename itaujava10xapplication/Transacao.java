package com.mycompany.itaujava10xapplication;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author David
 */
// Data usado para trabalhar com get e set 
@Data
// @AllArgsConstructor, serve para criar um construtor com todos os argumentos.
@AllArgsConstructor
// @NoArgsConstructor sem argumentos.
@NoArgsConstructor
public class Transacao {
    
    private BigDecimal valor;
    private OffsetDateTime dataHora;
    
    
    
}