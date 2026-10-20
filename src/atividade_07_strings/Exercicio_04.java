/*
04 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
    - Digite uma frase: Estou aprendendo Java
    - Digite uma palavra: Java
    - A palavra aparece na frase? true
*/

package atividade_07_strings;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Digite um palavra: ");
        String palavra = scanner.nextLine();

        boolean aparece = frase.contains(palavra);

        System.out.println("A palavra aparece na frase? " + aparece);
        scanner.close();
    }
}
