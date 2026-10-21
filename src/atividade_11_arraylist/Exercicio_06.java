/*
06 - Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e
em qual posição. Se não estiver, avise.
 */

package atividade_11_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Mariana", "Xavier", "Diego", "Helena", "Liss"));

        System.out.print("Nome que deseja buscar: ");
        String nomeBusca = scanner.nextLine();

        if (nomes.contains(nomeBusca)) {
            int posicao = nomes.indexOf(nomeBusca);
            System.out.println("O nome está na lista, na posição: " + posicao);
        } else {
            System.out.println("O nome não está na lista.");
        }

        scanner.close();
    }
}
