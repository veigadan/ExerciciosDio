package Exercicios;

import java.util.Scanner;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.


public class Exercicio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número a ser avaliado: ");
        int num = scanner.nextInt();

//        if (num % 2 == 0 ){
//            System.out.println("O número é par.");
//        } else {
//            System.out.println("O número é impar.");
//        }
//        if (num < 0){
//            System.out.println("O número é negativo.");
//        } else {
//            System.out.println("O número é positivo.");
//        }

        String resultadoPar = (num % 2 == 0) ? "Par" : "Ímpar";
        String resultadoSinal;

        if (num > 0) {
            resultadoSinal = "Positivo";
        } else if (num < 0) {
            resultadoSinal = "Negativo";
        } else {
            resultadoSinal = "Neutro";
        }

        System.out.printf("O número %d é %s e %s.%n", num, resultadoPar, resultadoSinal);
        scanner.close();
    }


}
