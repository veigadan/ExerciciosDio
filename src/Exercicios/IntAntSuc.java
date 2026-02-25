package Exercicios;

import java.util.Scanner;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.


public class IntAntSuc {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número inteiro desejado: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Erro: Isso não é um número inteiro. Tente novamente:");
            scanner.next();
        }

        int num = scanner.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.printf("O número escolhido foi %d, seu antecessor é %d e seu sucessor é %d", num, antecessor, sucessor);
        scanner.close();
    }
}
