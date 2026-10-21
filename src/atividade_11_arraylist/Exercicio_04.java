// 04 - Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

package atividade_11_arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio_04 {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>(Arrays.asList("Palmas", "Rio de Janeiro", "Teresina", "Goiânia"));

        cidades.remove(1);
        System.out.println("Cidades que sobraram: " + cidades.size());
        System.out.println("São elas: " + cidades);
    }
}
