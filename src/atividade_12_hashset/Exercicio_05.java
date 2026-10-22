// 05 - Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.

package atividade_12_hashset;
import java.util.Arrays;
import java.util.HashSet;

public class Exercicio_05 {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>(Arrays.asList("Cajá", "Abacate", "Melancia"));

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
