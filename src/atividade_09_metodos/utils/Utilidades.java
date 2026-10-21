package atividade_09_metodos.utils;

public class Utilidades {

    // ====== Método referente ao Exercício 02 ======
    public static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    // ====== Método referente ao Exercício 03 ======
    public static int dobro(int numero) {
        return numero * 2;
    }

    // ====== Método referente ao Exercício 04 ======
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    // ====== Método referente ao Exercício 05 ======
    public static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    // ====== Métodos referente ao Exercício 06 ======
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    // ====== Métodos referente ao Exercício 07 ======
    public static void saudacao() {
        System.out.println("Olá!");
    }

    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }
}
