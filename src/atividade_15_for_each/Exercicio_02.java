// 02 - Crie um ArrayList com 5 notas e imprima todas usando for-each.

package atividade_15_for_each;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio_02 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>(Arrays.asList(8.5, 7.0, 9.2, 6.0, 10.0));

        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}
