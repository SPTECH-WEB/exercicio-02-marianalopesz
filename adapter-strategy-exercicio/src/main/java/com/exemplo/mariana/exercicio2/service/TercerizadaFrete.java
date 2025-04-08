package com.exemplo.mariana.exercicio2.service;

import org.springframework.stereotype.Component;

@Component
public class TercerizadaFrete implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso * 9.0;
    }
    @Override
    public String modalidade() {
        return "transportadora";
    }
}
