/*
06 - Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
imprima o isEmpty() de novo.
 */

package atividade_12_hashset;
import java.util.HashSet;

public class Exercicio_06 {
    public static void main(String[] args) {
        HashSet<String> valores = new HashSet<>();

        System.out.println("Está vazio? " + valores.isEmpty());

        valores.add("Elemento 01");
        System.out.println("Está vazio? " + valores.isEmpty());
    }
}
