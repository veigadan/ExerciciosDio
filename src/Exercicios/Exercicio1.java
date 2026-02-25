package Exercicios;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.



public class Exercicio1 {
    static void main() {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = input1.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = input1.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = input1.nextDouble();

        double soma1 = a + b;
        if (soma1 < c) {
            System.out.println("A soma é MENOR que C: " + soma1);
        } else if (soma1 > c) {
            System.out.println("A soma é MAIOR que C: " + soma1);
        } else {
            System.out.println("A soma é IGUAL a C: " + soma1);
        }

        System.out.println("------------------------");

        Scanner input2 = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double n1 = input2.nextDouble();
        System.out.println("Digite o valor de B: ");
        double n2 = input2.nextDouble();
        System.out.println("Digite o valor de C: ");
        double n3 = input2.nextDouble();

        CalculadoraExercicio1 calculadora = new CalculadoraExercicio1(n1, n2, n3);

        calculadora.verificaSomaC();
    }
}
