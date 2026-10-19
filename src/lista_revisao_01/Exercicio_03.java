/*
03 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
1 - Ver camisas
2 - Ver calças
3 - Sair
Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise.
O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
 */

package lista_revisao_01;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Ver camisas.");
                    break;
                case 2:
                    System.out.println("Você escolheu: Ver calças.");
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
