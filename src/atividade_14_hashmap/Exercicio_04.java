/*
04 - Crie um HashMap de estoque (produto -> quantidade) com dois itens.
Use getOrDefault para mostrar a quantidade de um produto que existe
e de um que não existe (devolvendo 0). Depois tente com get normal
no que não existe e compare.
 */

package atividade_14_hashmap;
import java.util.HashMap;

public class Exercicio_04 {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Arroz", 15);
        estoque.put("Feijão", 8);

        // Usando getOrDefault para um item que existe e um que não existe
        System.out.println("Quantidade de Arroz (getOrDefault): " + estoque.getOrDefault("Arroz", 0));
        System.out.println("Quantidade de Macarrão (getOrDefault): " + estoque.getOrDefault("Macarrão", 0));

        // Usando get normal no item que não existe
        System.out.println("Quantidade de Macarrão (get normal): " + estoque.get("Macarrão"));
        // O get normal retorna 'null' quando a chave não é encontrada, enquanto o getOrDefault retorna o valor padrão (0)
    }
}
