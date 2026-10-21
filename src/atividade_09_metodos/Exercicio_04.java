/*
04 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas.
No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
 */

package atividade_09_metodos;
import atividade_09_metodos.utils.Utilidades;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota01 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota02 = scanner.nextDouble();

        double media = Utilidades.calcularMedia(nota01, nota02);
        System.out.printf("A média final é: %.2f\n", media);
        scanner.close();
    }
}
