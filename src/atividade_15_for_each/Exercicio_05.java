/*
05 - Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
usando o índice. Deixe os dois na mesma classe e compare.
*/

package atividade_15_for_each;

public class Exercicio_05 {
    public static void main(String[] args) {
        String[] nomes = {"Homem-Aranha", "Batman", "Super-Homem", "Hulk"};

        System.out.println("--- Impressão usando For-Each ---");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\n--- Impressão usando For ---");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }

        // Comparação: O for-each é mais limpo e direto quando precisamos apenas ler os elementos,
        // enquanto o for é necessário quando precisamos manipular ou saber o índice exato de cada item
    }
}
