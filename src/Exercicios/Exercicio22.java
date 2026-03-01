package Exercicios;

import java.util.Scanner;

//22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

public class Exercicio22 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor B:");
        int b = scanner.nextInt();

        if (b == 0){
            System.out.println("Não é possível dividir um número por zero.");
        } else {
            int divisao = a / b;

            int resto = a % b;

            System.out.println("O resultado da divisão é: " + divisao );
            System.out.println("O resto da divisão é: " + resto);
        }
        scanner.close();
    }
}
