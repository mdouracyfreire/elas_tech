/*
03 — Crie um método dobro(int numero) que devolve o dobro do número recebido.
No main, chame ele e mostre o resultado.
 */

package atividade_09_metodos;
import atividade_09_metodos.utils.Utilidades;

public class Exercicio_03 {
    public static void main(String[] args) {
        int resultado = Utilidades.dobro(5);
        System.out.println("O dobro é: " + resultado);
    }
}
