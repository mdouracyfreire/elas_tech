/*
05 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
Trate a ArithmeticException para o caso de ela digitar 0.
 */

package atividade_10_tratamento_excecoes;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int resto = 100 % numero;
            System.out.println("O resto da divisão de 100 por " + numero + " é: " + resto);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível calcular o resto dividindo por zero.");
        }

        scanner.close();
    }
}
