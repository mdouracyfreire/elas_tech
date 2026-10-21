/*
06 — Crie três métodos com o mesmo nome somar:

um que recebe dois inteiros
um que recebe três inteiros
um que recebe dois decimais

No main, chame os três e veja o Java escolher sozinho qual usar.
 */

package atividade_09_metodos;
import atividade_09_metodos.utils.Utilidades;

public class Exercicio_06 {
    public static void main(String[] args) {
        System.out.println("Soma de 2 inteiros: " + Utilidades.somar(5, 10));
        System.out.println("Soma de 3 inteiros: " + Utilidades.somar(2, 4, 6));
        System.out.println("Soma de 2 decimais: " + Utilidades.somar(5.5, 4.2));
    }
}
