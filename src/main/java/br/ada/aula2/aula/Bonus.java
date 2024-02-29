package br.ada.aula2.aula;

public class Bonus {

    public double calcularBonus(int vitaminas, int xaropes, double salario) {
        double bonus = 0;
        if (vitaminas > 20 && xaropes > 5) {
            bonus = 0.05;
        }

        if (vitaminas > 30 && xaropes > 10) {
            bonus = 0.10;
        }

        return salario * bonus;
    }

    /*public double dividir(double num1, double num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("Nao existe divisao por 0");
        }
        return num1 / num2;
    }*/
}
