/*
05 - Crie um HashMap de notas com três alunas.
Imprima o mapa e o tamanho.
Remova uma delas e imprima de novo.
 */

package atividade_14_hashmap;
import java.util.HashMap;

public class Exercicio_05 {
    public static void main(String[] args) {
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Tinky Winky", 8.5);
        notas.put("Dipsy", 9.0);
        notas.put("Laa-Laa", 7.5);

        System.out.println("Mapa de notas: " + notas);
        System.out.println("Tamanho inicial: " + notas.size());

        notas.remove("Dipsy");

        System.out.println("Mapa após remoção: " + notas);
        System.out.println("Novo tamanho: " + notas.size());
    }
}
