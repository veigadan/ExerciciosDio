package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é de: " + imc);

        if (imc <= 18.5){
            System.out.println("Você está abaixo do peso.");
        } else if (imc <= 24.9){
            System.out.println("Você está no peso ideal. Parabéns!");
        } else if (imc <= 29.9){
            System.out.println("Você está levemente acima do peso.");
        } else if (imc <= 34.9){
            System.out.println("Você tem obesidade de grau I.");
        } else if (imc <= 39.9){
            System.out.println("Você tem obesidade de grau II (Severa).");
        } else {
            System.out.println("Você tem obesidade de grau III (Mórbida).");
        }
        scanner.close();
    }
}
