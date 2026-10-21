// 04 - Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

package atividade_08_arrays;
import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\n=== Números de trás para frente ===");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
