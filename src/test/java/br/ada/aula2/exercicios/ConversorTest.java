package br.ada.aula2.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversorTest {

    @Test
    public void converterCelsiusToFahrenheit() {
        Conversor conversor = new Conversor();
        double temperaturaFahrenheit = conversor.converterCelsiusParaFahrenheit(100);
        assertEquals(temperaturaFahrenheit,212);
    }

}