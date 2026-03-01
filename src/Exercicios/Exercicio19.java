package Exercicios;

//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Exercicio19 {
    static void main() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10 ; j++) {
                int multiplicacao = i * j;
                System.out.println(i + " x " + j + " = " + multiplicacao);
            }

            System.out.println();
        }
    }
}
