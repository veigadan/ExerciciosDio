package Exercicios;

import java.util.Scanner;

public class DoisValoresAB {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da variável A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor da variável B: ");
        int b = scanner.nextInt();

        if (a == b) {
            int c = a + b;
            System.out.println("O valor da soma de A com B é: " + c);
        } else {
            int c = a * b;
            System.out.println("O valor da multiplicação de A por B é: " + c);
        }
    }
}
