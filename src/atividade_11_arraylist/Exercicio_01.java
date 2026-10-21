// 01 - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

package atividade_11_arraylist;
import java.util.ArrayList;

public class Exercicio_01 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Dora");

        System.out.println("Lista de nomes: " + nomes);
    }
}
