package Exercicios;

//18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
//Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.

public class Exercicio18 {
    static void main() {
        double alturaFrancisco = 150.0;
        double alturaSara = 110.0;
        int anos = 0;

        while (alturaFrancisco >= alturaSara){
            alturaFrancisco += 2;
            alturaSara += 3;
            anos++;
        }

        System.out.printf("Serão necessários %d anos para que Sara seja maior que Francisco.\n", anos);
        System.out.printf("Altura final de Francisco: %.2fm\n", (alturaFrancisco / 100));
        System.out.printf("Altura final de Sara: %.2fm", (alturaSara / 100));
    }
}
