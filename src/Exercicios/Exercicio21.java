package Exercicios;

import java.util.Random;

//21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

public class Exercicio21 {
    static void main() {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);

        System.out.println("O número escolhido aleatoriamente foi: " + numeroAleatorio);
    }
}
