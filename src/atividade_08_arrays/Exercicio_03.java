// 03 - Com o mesmo array de notas, calcule e mostre a soma e a média.

package atividade_08_arrays;

public class Exercicio_03 {
    public static void main(String[] args) {
        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
    }
}
