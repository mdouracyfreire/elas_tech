// 02 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

package atividade_06_scanner;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Divisão: " + ((double) num1 / num2));
            System.out.println("Resto: " + (num1 % num2));
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
