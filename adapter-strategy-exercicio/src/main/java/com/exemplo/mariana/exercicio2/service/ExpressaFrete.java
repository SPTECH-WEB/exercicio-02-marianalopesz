package com.exemplo.mariana.exercicio2.service;

import org.springframework.stereotype.Component;

@Component
public class ExpressaFrete implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }

    @Override
    public String modalidade() {
        return "expressa";
    }
}
