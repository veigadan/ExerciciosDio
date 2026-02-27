package Exercicios;

import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.


public class Exercicio14 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.printf("Valores originais: A = %d, B = %d \n", a, b);

        int aux = a;
        a = b;
        b = aux;

        System.out.printf("Valores invertidos: A = %d, B = %d", a, b);

        scanner.close();
    }
}
