package com.exemplo.mariana.exercicio2.controller;

import com.exemplo.mariana.exercicio2.service.FreteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fretes")
public class FreteController {
    private final FreteService freteService;
    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping
    public String calculaFrete(@RequestParam String modalidade, @RequestParam double peso) {
        double valor = freteService.calcular(modalidade, peso);
        return "Frete("+modalidade+") para "+peso+"Kg: R$"+valor;
    }
}
