/*
01 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando
que não dá pra dividir por zero.
 */

package atividade_10_tratamento_excecoes;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o 1º número inteiro: ");
            int num01 = scanner.nextInt();

            System.out.print("Digite o 2º número inteiro: ");
            int num02 = scanner.nextInt();

            int divisao = num01 / num02;
            System.out.println("O resultado da divisão é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
