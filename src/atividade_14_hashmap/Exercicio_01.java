/*
01 - Crie um HashMap de nomes e idades com três pessoas.
Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.
 */

package atividade_14_hashmap;
import java.util.HashMap;

public class Exercicio_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Leôncio", 68);
        pessoas.put("Billie", 32);
        pessoas.put("Alvin", 17);

        System.out.println("Mapa completo: " + pessoas);
        System.out.println("Idade do Alvin: " + pessoas.get("Alvin"));
    }
}
