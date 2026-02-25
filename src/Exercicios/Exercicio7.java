package Exercicios;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.


public class Exercicio7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor (true ou false): ");
        boolean valor1 = scanner.nextBoolean();
        System.out.println("Digite o segundo valor (true ou false): ");
        boolean valor2 = scanner.nextBoolean();

        if (valor1 && valor2){
            System.out.println("Ambos os valores são verdadeiros (true).");
        } else if (!valor1 && !valor2){
            System.out.println("Ambos os valores são falsos (false).");
        } else {
            System.out.println("Um valor é verdadeiro e o outro é falso.");
        }
        scanner.close();
    }
}
