package Exercicios;

import java.util.*;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

public class Exercicio8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> conjunto = new LinkedHashSet<>();

        System.out.println("Digite 3 números inteiros diferentes:");

        while (conjunto.size() < 3){
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();

            if (!conjunto.add(num)){
                System.out.println("O número digitado já foi escolhido anteriormente.");
            }
        }

        Integer[] resultado = conjunto.toArray(new Integer[0]);
        Arrays.sort(resultado, Collections.reverseOrder());

        System.out.println("Os valores em ordem decrescente são: " + Arrays.toString(resultado));

        scanner.close();
    }
}
