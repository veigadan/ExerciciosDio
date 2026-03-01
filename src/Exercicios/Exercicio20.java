package Exercicios;

import java.util.Scanner;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

public class Exercicio20 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do qual deseja saber a tabuada: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplicacao = num * i;
            System.out.println(num + " x " + i + " = " + multiplicacao);
        }
        scanner.close();
    }
}
