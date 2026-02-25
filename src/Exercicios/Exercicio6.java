package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        double num = scanner.nextDouble();

        double reajuste = num * 1.05;

        System.out.printf("O resultado do valor com um reajuste de 5 por cento é %.2f", reajuste);
        scanner.close();
    }
}
