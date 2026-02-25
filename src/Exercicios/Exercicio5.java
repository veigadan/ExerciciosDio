package Exercicios;

import java.util.Scanner;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

public class Exercicio5 {
    static void main() {
            double salarioMinimo = 1293.20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        if (scanner.hasNextDouble()) {
            double salarioUsuario = scanner.nextDouble();
            double quantidadeSalario = salarioUsuario / salarioMinimo;

            System.out.printf("O usuário ganha %.2f salários mínimos.%n", quantidadeSalario);
        } else {
            System.out.println("Erro: Por favor, digite um valor numérico válido.");
        }
        scanner.close();

    }
}
