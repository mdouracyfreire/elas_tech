/*
06 - Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
   - se estiver vazia   -> "Não tem ninguém na fila."
   - se tiver gente     -> "Próximo: [nome]"
Depois adicione uma pessoa e teste de novo.
 */

package atividade_13_arraydeque;
import java.util.ArrayDeque;
import java.util.Queue;

public class Exercicio_06 {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

        fila.add("Daniela");

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }
    }
}
