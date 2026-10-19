/*
01 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
 */

package lista_revisao_01;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do lanche: ");
        String lanche = scanner.nextLine();

        System.out.println("Digite o valor do lanche: ");
        double valor = scanner.nextDouble();

        if (valor > 30.00) {
            valor -= 5.00;
        }

        System.out.printf("O lanche %s custa R$ %.2f \n", lanche, valor);
        scanner.close();
    }
}