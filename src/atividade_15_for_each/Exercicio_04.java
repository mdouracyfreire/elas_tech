/*
04 - Com um array de nomes, use for-each e um if para contar quantos
têm mais de 5 letras. Mostre o total. Dica: usem o método length.
 */

package atividade_15_for_each;

public class Exercicio_04 {
    public static void main(String[] args) {
        String[] nomes = {"Pernalonga", "Patolino", "Lola", "Gaguinho", "Taz"};
        int contador = 0;

        for (String nome : nomes) {
            if (nome.length() > 5) {
                contador++;
            }
        }

        System.out.println("Quantidade de nomes com mais de 5 letras: " + contador);
    }
}
