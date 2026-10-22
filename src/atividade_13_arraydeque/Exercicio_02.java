/*
02 - Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
imprima a fila logo depois. Repare que ela não mudou.
 */

package atividade_13_arraydeque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Exercicio_02 {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();
        fila.addAll(List.of("Florzinha", "Lindinha", "Docinho"));

        System.out.println("Próximo da fila (peek): " + fila.peek());
        System.out.println("Fila após o peek: " + fila);
        //  O peek apenas visualiza o primeiro elemento sem removê-lo, mantendo a fila inalterada.
    }
}
