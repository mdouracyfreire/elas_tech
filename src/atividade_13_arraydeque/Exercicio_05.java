/*
05 - Crie uma fila com três nomes e use contains para responder duas
perguntas: se "Bia" está na fila e se "Zoe" está.
 */

package atividade_13_arraydeque;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Exercicio_05 {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>(Arrays.asList("Lola", "Zoe", "Winnie"));

        System.out.println("A Bia está na fila? " + fila.contains("Bia"));
        System.out.println("A Zoe está na fila? " + fila.contains("Zoe"));
    }
}
