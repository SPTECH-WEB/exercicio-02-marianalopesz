package com.exemplo.mariana.exercicio2.service;

import org.springframework.stereotype.Component;



@Component
class APITransportadoraExterna {
    public double calculaValorFrete(double massa) {
        return massa * 7.25;
    }
}

@Component
public class ExternaFrete implements FreteStrategy{
    private final APITransportadoraExterna apiExterna;

    public ExternaFrete(APITransportadoraExterna apiExterna) {
        this.apiExterna = apiExterna;
    }


    @Override
    public double calcular(double peso) {
        return apiExterna.calculaValorFrete(peso);
    }

    @Override
    public String modalidade() {
        return "transportadora-externa";
    }

}
