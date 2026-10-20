// 03 — Peça o nome da pessoa e mostre a primeira letra dele.

package atividade_07_strings;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        char primeiraLetra = nome.charAt(0);

        System.out.println("A primeira letra do nome é: " + primeiraLetra);
        scanner.close();
    }
}
