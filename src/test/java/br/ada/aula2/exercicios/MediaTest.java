package br.ada.aula2.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MediaTest {
    @Test
    public void calcularMedia() {
        Media media = new Media();
        double mediaRecebida = media.calcularMedia(1, 2, 3);
        assertEquals(mediaRecebida, 2);
    }
}