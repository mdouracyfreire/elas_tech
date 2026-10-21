/*
 02 - Crie uma lista já preenchida com quatro frutas.
 Imprima a primeira, a última e quantas frutas tem.
 */

package atividade_11_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio_02 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Uva", "Laranja"));

        System.out.println("Primeira fruta: " + frutas.getFirst());
        System.out.println("Primeira fruta: " + frutas.get(0)); // Forma alternativa

        System.out.println("Última fruta: " + frutas.getLast());
        System.out.println("Última fruta: " + frutas.get(frutas.size() - 1)); // Forma alternativa

        System.out.println("Quantidade de frutas: " + frutas.size());
    }
}
