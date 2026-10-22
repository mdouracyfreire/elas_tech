/*
04 - Crie um HashSet com três CPFs e imprima.
Depois remova um deles e imprima de novo, junto com o tamanho.
 */

package atividade_12_hashset;
import java.util.HashSet;

public class Exercicio_04 {
    public static void main(String[] args) {
        HashSet<String> cpfs = new HashSet<>();

        cpfs.add("111.111.111-11");
        cpfs.add("222.222.222-22");
        cpfs.add("333.333.333-33");

        System.out.println("CPFs iniciais: " + cpfs);

        cpfs.remove("222.222.222-22");
        System.out.println("CPFs após remoção: " + cpfs);
        System.out.println("Novo tamanho: " + cpfs.size());
    }
}
