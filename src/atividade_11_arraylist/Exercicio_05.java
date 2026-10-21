/*
05 - Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`.
(Dica: i + ": " + comando para pegar posição da lista)
 */

package atividade_11_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio_05 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Alice", "Tico", "Fernanda", "Tiago", "Mila", "Pablo"));

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + ": " + nomes.get(i));
        }
    }
}
