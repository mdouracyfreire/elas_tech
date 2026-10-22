/*
01 - Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido.
Imprima o conjunto e o tamanho. Repare no que aconteceu com o repetido.
 */

package atividade_12_hashset;
import java.util.HashSet;

public class Exercicio_01 {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();

        nomes.add("Maria");
        nomes.add("Vivian");
        nomes.add("Peter");
        nomes.add("Maria");

        System.out.println("Conjunto de nomes: " + nomes);
        System.out.println("Tamanho do conjunto: " + nomes.size());
        // O elemento repetido é ignorado, pois o HashSet não aceita duplicações.
    }
}
