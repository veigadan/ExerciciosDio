package Exercicios;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.

public class Exercicio16 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado a: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor do lado b: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valor do lado c: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os lados formam um triângulo.");

            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }
        }
        else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        scanner.close();
    }
}
