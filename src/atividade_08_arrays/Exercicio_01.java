// 01 - Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

package atividade_08_arrays;

public class Exercicio_01 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Helena", "Lucas", "Aurora", "Pedro"};

        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Segundo nome: " + nomes[2]);
        System.out.println("Terceiro nome: " + nomes[nomes.length - 1]);
    }
}
