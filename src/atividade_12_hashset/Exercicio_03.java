/*
03 - Crie um ArrayList com nomes repetidos.
Use new HashSet<>(lista) para tirar os repetidos. Imprima os dois e compare.
 */

package atividade_12_hashset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercicio_03 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>(Arrays.asList("Liana", "Gio", "Liana", "Catarina", "Gio"));
        HashSet<String> conjuntoNomes = new HashSet<>(listaNomes);

        System.out.println("ArrayList original (com repetidos): " + listaNomes);
        System.out.println("HashSet (sem repetidos): " + conjuntoNomes);
    }
}
