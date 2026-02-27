package Exercicios;

import java.util.Scanner;

// 13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

public class Exercicio13 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.printf("Seu nome é %s, você tem %d anos e é maior de idade.", nome, idade);
        } else {
            System.out.printf("Seu nome é %s, você tem %d anos e é menor de idade.", nome, idade);
        }

        scanner.close();
    }
}
