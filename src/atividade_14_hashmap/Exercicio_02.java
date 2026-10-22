/*
02 - Crie um HashMap de produtos e preços.
Coloque "café" com valor 5.00, imprima, e depois faça put de "café" DE NOVO com valor 7.50.
Imprima outra vez e veja o que aconteceu com o tamanho.
 */

package atividade_14_hashmap;
import java.util.HashMap;

public class Exercicio_02 {
    public static void main(String[] args) {
        HashMap<String, Double> precos = new HashMap<>();

        precos.put("café", 5.00);
        System.out.println("Antes da atualização: " + precos + " (Tamanho: " + precos.size() + ")");

        // A chave "café" já existe, então o put atualiza o valor correspondente
        precos.put("café", 7.50);
        System.out.println("Depois da atualização: " + precos + " (Tamanho: " + precos.size() + ")");
        // O tamanho permanece o mesmo (1), pois o HashMap sobrescreve o valor da chave existente
    }
}
