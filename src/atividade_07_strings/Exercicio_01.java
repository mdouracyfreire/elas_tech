// 01 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

package atividade_07_strings;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        int quantidadeLetras = nomeCompleto.length();

        System.out.println("O nome tem " + quantidadeLetras + " caracteres (contando os espaços)");
        scanner.close();
    }
}
