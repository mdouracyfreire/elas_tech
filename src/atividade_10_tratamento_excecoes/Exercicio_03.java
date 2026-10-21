/*
03 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número,
trate a InputMismatchException e mostre uma mensagem pedindo um número.
 */

package atividade_10_tratamento_excecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Idade informada: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida! Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}
