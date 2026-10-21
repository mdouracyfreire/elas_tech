/*
02 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
 */

package atividade_10_tratamento_excecoes;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = {8.5, 7.0, 9.2, 6.0, 10.0};

        try {
            System.out.print("Informe a posição que deseja consultar (0 a 4): ");
            int posicao = scanner.nextInt();

            System.out.println("A nota na posição " + posicao + " é: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Essa posição não existe, o array só vai de 0 a 4.");
        }

        scanner.close();
    }
}
