/*
03 - Mesma fila. Agora use poll para atender o primeiro e imprima a fila
depois. Compare com o exercício 2.
 */

package atividade_13_arraydeque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Exercicio_03 {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();
        fila.addAll(List.of("Florzinha", "Lindinha", "Docinho"));

        System.out.println("Atendido agora (poll): " + fila.poll());
        System.out.println("Fila após o poll: " + fila);
        // Diferente do peek (Exercício 02), o poll remove efetivamente o primeiro elemento da fila.
    }
}
