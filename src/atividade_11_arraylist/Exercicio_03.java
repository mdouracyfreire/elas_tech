/*
03 - Crie uma lista com quatro nomes.
Troque o nome da posição 2 por outro e imprima a lista antes e depois.
 */

package atividade_11_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio_03 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Caio", "Alice", "Luana", "Frederico"));

        System.out.println("Lista antes: " + nomes);

        nomes.set(2, "Eduardo");
        System.out.println("Lista depois: " + nomes);
    }
}
