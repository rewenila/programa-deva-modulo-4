package br.ada.aula2.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    public void somar() {
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(2, 2);
        assertEquals(soma,4);
    }

    @Test
    public void subtrair() {
        Calculadora calculadora = new Calculadora();
        double subtracao = calculadora.subtrair(2, 2);
        assertEquals(subtracao,0);
    }

    @Test
    public void multiplicar() {
        Calculadora calculadora = new Calculadora();
        double multiplicacao = calculadora.multiplicar(2, 2);
        assertEquals(multiplicacao,4);
    }

    @Test
    public void dividir() {
        Calculadora calculadora = new Calculadora();
        double divisao = calculadora.dividir(2, 2);
        assertEquals(divisao,1);
    }

}