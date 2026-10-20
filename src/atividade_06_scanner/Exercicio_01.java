// 01 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

package atividade_06_scanner;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        int proximoAno = idade + 1;

        System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer " + proximoAno + " no próximo aniversário.");

        scanner.close();
    }
}
