/*
04 - Crie uma fila com três nomes e atenda todos usando
while (!fila.isEmpty()). No final, imprima "Fila vazia!".
 */

package atividade_13_arraydeque;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Exercicio_04 {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>(Arrays.asList("Tom", "Picolino", "Frajola"));

        while (!fila.isEmpty()) {
            System.out.println("Atendendo: " + fila.poll());
        }

        System.out.println("Fila vazia!");
    }
}
