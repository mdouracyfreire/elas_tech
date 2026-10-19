/*
06 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
 */

package lista_revisao_01;
import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Ano de Nascimento: ");
        int anoNascimento = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite seu Nome Completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("O usuário " + nomeCompleto + " nasceu em " + anoNascimento);
        scanner.close();
    }
}
