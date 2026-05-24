/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itaujava10xapplication;

import lombok.Getter;

@Getter


public class EstatisticaDTO {
        
    private long count;
    private final Double avg;
    private final Double max;
    private final Double min;
    private final Double sum;
        
    public EstatisticaDTO(long count, Double avg, Double max, Double min, Double sum) {
    this.count = count;
    this.avg = avg;
    this.max = max;
    this.min = min;
    this.sum = sum;
        
        
    }
    
}
