// 03 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

package atividade_06_scanner;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da aluna: ");
        double nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovada");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }

        scanner.close();
    }
}
