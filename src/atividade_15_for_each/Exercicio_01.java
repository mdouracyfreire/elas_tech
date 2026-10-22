/*
01 - Crie um array (não arrayList, array normal) com 4 nomes e imprima
todos usando for-each, um por linha.
 */

package atividade_15_for_each;

public class Exercicio_01 {
    public static void main(String[] args) {
        String[] nomes = {"Homem-Aranha", "Batman", "Super-Homem", "Hulk"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
