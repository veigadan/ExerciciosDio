package Exercicios;

import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.


public class DoisValoresAB {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da variável A: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Isso não é um número inteiro. Tente novamente:");
            scanner.next();
        }
        int a = scanner.nextInt();

        System.out.println("Digite o valor da variável B: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Isso não é um número inteiro. Tente novamente:");
            scanner.next();
        }
        int b = scanner.nextInt();

        if (a == b) {
            int c = a + b;
            System.out.println("O valor da soma de A com B é: " + c);
        } else {
            int c = a * b;
            System.out.println("O valor da multiplicação de A por B é: " + c);
        }

        scanner.close();
    }
}
