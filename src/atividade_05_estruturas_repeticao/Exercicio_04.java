// 04 - Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

package atividade_05_estruturas_repeticao;

public class Exercicio_04 {
    public static void main(String[] args) {
        int numero = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
