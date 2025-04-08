package com.exemplo.mariana.exercicio2.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;
    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String modalidade, double peso) {
        return estrategias.stream()
                .filter(e ->e.modalidade().equalsIgnoreCase(modalidade))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Modalidade de Frete inválida"))
                .calcular(peso);
    }

}
