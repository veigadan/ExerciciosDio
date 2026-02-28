package Exercicios;

import java.util.Scanner;

//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)

public class Exercicio17 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double tempFahrenheit = scanner.nextDouble();

        double tempCelsius = (5*(tempFahrenheit-32)/9);

        System.out.printf("A temperatura escolhida em Fahrenheit foi de %.2f \nEm Celsius ela será convertida para %.2f", tempFahrenheit, tempCelsius);
        scanner.close();
    }
}
