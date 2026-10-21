/*
05 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade
e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
 */

package atividade_09_metodos;
import atividade_09_metodos.utils.Utilidades;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        scanner.close();
    }
}
