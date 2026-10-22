// 01 - Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.

package atividade_13_arraydeque;
import java.util.ArrayDeque;
import java.util.Queue;

public class Exercicio_01 {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();

        fila.add("Pietra");
        fila.add("Lucas");
        fila.add("Ricardo");

        System.out.println("Fila: " + fila);
        System.out.println("Quantidade de pessoas na fila: " + fila.size());
    }
}
