package Exercicios;

import java.time.LocalDate;
import java.util.Scanner;

//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.
//
//        (Ex: 5 anos, 2 meses e 15 dias de vida)

public class Exercicio15 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();
        int diaAtual = hoje.getDayOfMonth();
        int mesAtual = hoje.getMonthValue();
        int anoAtual = hoje.getYear();

        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anosVividos = anoAtual - anoNascimento;

        int mesesVividos = (mesAtual - 1);
        int diasVividos = diaAtual;

        System.out.printf("Você viveu aproximadamente: %d anos, %d meses e %d dias.", anosVividos, mesesVividos, diasVividos);

        scanner.close();

    }
}
