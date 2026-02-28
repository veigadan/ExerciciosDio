package Exercicios;

import java.util.Scanner;

// 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
//pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

public class Exercicio12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto em R$: ");
        double valorProduto = scanner.nextDouble();

        System.out.println("Métodos de Pagamento");
        System.out.println("1 - À Vista (Dinheiro ou Pix) - 15% de desconto");
        System.out.println("2 - À vista (Cartão) - 10% de desconto");
        System.out.println("3 - Parcelado em 2x (Sem juros)");
        System.out.println("4 - Parcelado em 3x ou mais - 10% de juros");
        System.out.println("Escolha uma opção: ");
        int condicao = scanner.nextInt();

        double valorFinal = 0;

        switch (condicao) {
            case 1:
                valorFinal = valorProduto * 0.85;
                System.out.printf("Total com desconto: \n R$%.2f%n", valorFinal);
                break;
            case 2:
                valorFinal = valorProduto * 0.90;
                System.out.printf("Total com desconto: \n R$%.2f%n", valorFinal);
                break;
            case 3:
                valorFinal = valorProduto;
                System.out.printf("Total:\n R$%.2f em 2x de R$%.2f%n", valorFinal, (valorFinal / 2));
                break;
            case 4:
                System.out.println("Deseja parcelar em quantas vezes? (3 ou mais)");
                int qtdParcelas = scanner.nextInt();
                if (qtdParcelas >= 3) {
                    valorFinal = valorProduto * 1.10;
                    double valorParcela = valorFinal / qtdParcelas;
                    System.out.printf("Total com juros: \n R$%.2f%n", valorFinal);
                    System.out.printf("Pagamento em %dx de R$%.2f%n", qtdParcelas, valorParcela);
                } else {
                    System.out.println("Quantidade de parcelas inválida.");
                }
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
        }
        scanner.close();
    }
}
