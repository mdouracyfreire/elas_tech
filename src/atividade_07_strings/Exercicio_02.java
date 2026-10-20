// 02 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

package atividade_07_strings;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Em maiúsculo: " + nome.toUpperCase());
        System.out.println("Em minúsculo: " + nome.toLowerCase());
        scanner.close();
    }
}
