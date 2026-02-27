package Exercicios;

import java.util.Scanner;

//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//
//de acordo com a tabela abaixo:
//
//Fórmula do IMC = peso / (altura) ²
//
//Tabela Condições IMC
//
//
//
//Abaixo de 18,5   | Abaixo do peso
//
//Entre 18,6 e 24,9 | Peso ideal (parabéns)
//
//Entre 25,0 e 29,9 | Levemente acima do peso
//
//Entre 30,0 e 34,9 | Obesidade grau I
//
//Entre 35,0 e 39,9 | Obesidade grau II (severa)
//
//Maior ou igual a 40 | Obesidade grau III (mórbida)


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
