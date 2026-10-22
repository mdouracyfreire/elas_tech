/*
03 - Crie uma agenda (nome -> telefone) com duas pessoas.
Use containsKey dentro de um if para mostrar o telefone de alguém
que está na agenda e de alguém que não está.
 */

package atividade_14_hashmap;
import java.util.HashMap;

public class Exercicio_03 {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Lila", "(11) 11111-1111");
        agenda.put("Maycon", "(22) 22222-2222");

        String buscaTelefone = "Lila";

        // A variável abaixo busca por um que não está contido na agenda
        // String buscaTelefone = "Carla";

        if (agenda.containsKey(buscaTelefone)) {
            System.out.println("Telefone de " + buscaTelefone + ": " + agenda.get(buscaTelefone));
        } else {
            System.out.println("A pessoa " + buscaTelefone + " não está na agenda");
        }
    }
}
