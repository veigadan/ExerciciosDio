package Exercicios;

import java.util.Scanner;

//23 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
//As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
//Imprima na tela o salário líquido final.

public class Exercicio23 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da hora aula: ");
        double valorAula = scanner.nextDouble();

        System.out.println("Digite a quantidade de aulas: ");
        int qtdAulas = scanner.nextInt();

        System.out.println("Digite o percentual de desconto do INSS: ");
        double descontoInss = scanner.nextDouble();

        double salarioBruto = qtdAulas * valorAula;

        double valorDesconto = (descontoInss / 100) * salarioBruto;

        double salarioLiquido = salarioBruto - valorDesconto;

        System.out.printf("Valor do salário bruto: %.2f\n", salarioBruto);
        System.out.printf("Valor do desconto do INSS: %.2f\n", valorDesconto);
        System.out.printf("Valor do salário líquido: %.2f", salarioLiquido);

        scanner.close();
    }
}
