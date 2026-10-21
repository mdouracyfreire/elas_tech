/*
6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a
ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe."
Depois do try/catch, imprima "O programa continua funcionando."
 */

package atividade_10_tratamento_excecoes;

public class Exercicio_06 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Maria", "Caio"};

        try {
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe.");
        }

        System.out.println("O programa continua funcionando.");
    }
}
