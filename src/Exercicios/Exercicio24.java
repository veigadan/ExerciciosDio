package Exercicios;

import java.util.Scanner;

public class Exercicio24 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        final int KM_POR_LITRO = 12;

        System.out.println("Digite o tempo gasto na viagem em horas: ");
        double tempo = scanner.nextDouble();

        System.out.println("Digite a velocidade média em km/h: ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double gasolina = distancia / KM_POR_LITRO;

        System.out.println("Tempo gasto na viagem: " + tempo + "h");
        System.out.println("Velocidade média da viagem: " + velocidade + "km/h");
        System.out.println("Distância da viagem: " + distancia + "km");
        System.out.printf("Combustível gasto na viagem: %.2fL", gasolina);

        scanner.close();
    }
}
