package br.ada.aula2.aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusTest {
    @Test
    public void deveReceber5PorcentoBonus() {
        // AAA
        // Arrange - preparation
        Bonus bonus = new Bonus();
        // Act - action
        double bonusRecebido = bonus.calcularBonus(21, 6, 1000);
        // Assertion - validation
        assertEquals(bonusRecebido, 50);

        // Other option: Given When Then
    }

    @Test
    public void deveReceber10PorcentoBonus() {
        Bonus bonus = new Bonus();
        double bonusRecebido = bonus.calcularBonus(31, 12, 1000);
        assertEquals(bonusRecebido, 100);
    }

    @Test
    public void naoRecebeBonus() {
        Bonus bonus = new Bonus();
        double bonusRecebido = bonus.calcularBonus(19, 5, 1000);
        assertEquals(bonusRecebido, 0);
    }


    /*@Test
    public void deveRetornar3ponto5() throws Exception {
        Bonus calculadora = new Bonus();
        double result = calculadora.dividir(7.0, 2.0);
        assertEquals(3.5, result);
    }

    @Test
    public void error_sum_to_zero()  {
        Bonus calculadora = new Bonus();
        assertThrows(Exception.class ,() -> {
                    calculadora.dividir(7.0, 0.0);
                }
        );
    }*/

}