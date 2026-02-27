package Exercicios;

import java.util.Scanner;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

public class Exercicio10 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média final é: %.2f \n", media);

        scanner.close();
    }
}
