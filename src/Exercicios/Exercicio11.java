package Exercicios;

import java.util.Scanner;

// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
//se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.


public class Exercicio11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("Caro %s, sua média final é: %.2f \n", nome, media);
        if (media >= 7) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Você ficou de recuperação.");
        }
        scanner.close();
    }
}
