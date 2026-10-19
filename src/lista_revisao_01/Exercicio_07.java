/*
07 -  DESAFIO — Sistema de Cadastro de Alunas
Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas.
O programa fica rodando até a pessoa escolher sair.

Este desafio tem regras de construção obrigatórias.
Não é só fazer funcionar, é fazer funcionando do jeito pedido.
Sigam as instruções solicitadas, pois o objetivo é praticar as estruturas que vimos essa semana.

O que o programa faz:
Pergunta se a pessoa quer iniciar (1 para continuar, 2 para sair)
Se escolher 1:
- pede a primeira nota
- pede a segunda nota
- calcula a média
- pede o nome da aluna
- decide se ela foi aprovada (média 6 ou mais)
- mostra uma frase com o nome, as duas notas, a média e se foi aprovada
- volta pro menu

Se escolher 2:
- mostra uma mensagem de despedida e encerra

Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu
 */

package lista_revisao_01;
import java.util.Locale;
import java.util.Scanner;

class Aluna {
    String nome;
    double nota_01;
    double nota_02;
    double media;
    boolean passou;
}

public class Exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Deseja iniciar?\nPressione 1 continuar, 2 para sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();

                    System.out.println("Primeira Nota: ");
                    aluna.nota_01 = scanner.nextDouble();

                    System.out.println("Segunda Nota: ");
                    aluna.nota_02 = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Nome da Aluna: ");
                    aluna.nome = scanner.nextLine();

                    aluna.media = (aluna.nota_01 + aluna.nota_02) / 2.0;
                    aluna.passou = aluna.media >= 6.0;

                    System.out.println("============================");
                    System.out.printf("Aluna: %s\nPrimeira Nota: %.1f\nSegunda Nota: %.1f\nMédia Final: %.1f\nAluna aprovada: %b\n",
                            aluna.nome, aluna.nota_01, aluna.nota_02, aluna.media, aluna.passou
                    );
                    System.out.println("============================");
                    break;

                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 2);

        scanner.close();
    }
}
