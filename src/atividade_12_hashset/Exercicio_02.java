/*
02 - Crie um HashSet de cores usando addAll. Depois use contains dentro
de um if para avisar se a cor "verde" já está no conjunto ou não.
 */

package atividade_12_hashset;
import java.util.Arrays;
import java.util.HashSet;

public class Exercicio_02 {
    public static void main(String[] args) {
        HashSet<String> cores = new HashSet<>(Arrays.asList("azul", "vermelho", "roxo", "verde"));

        if (cores.contains("verde")) {
            System.out.println("A cor verde está no conjunto");
        } else {
            System.out.println("A cor verde não está no conjunto");
        }
    }
}
