package br.ada.aula2.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
class NumeroTest {
    @Test
    public void isNumeroPar() {
        Numero numero = new Numero();
        boolean isPar = numero.isNumeroPar(10);
        assertTrue(isPar);
        boolean isImpar = numero.isNumeroPar(5);
        assertFalse(isImpar);
    }

}