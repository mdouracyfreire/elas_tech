/*
05 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
Na classe principal, faça um laço for que repita 3 vezes.
A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
Instancie um novo Produto e guarde nele os valores digitados.
Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
 */

package lista_revisao_01;
import java.util.Locale;
import java.util.Scanner;

class Produto {
    String nome;
    double preco;
}

public class Exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Produto produto = new Produto();

            System.out.println("\nCadastro do Produto " + i);
            System.out.print("Nome: ");
            produto.nome = scanner.next();

            System.out.print("Preço: ");
            produto.preco = scanner.nextDouble();

            if (produto.preco > 100) {
                System.out.println("Produto caro!");
            } else {
                System.out.println("Produto com preço acessível!");
            }

            System.out.printf("O produto %s custa R$ %.2f\n", produto.nome, produto.preco);
        }
        scanner.close();
    }
}
