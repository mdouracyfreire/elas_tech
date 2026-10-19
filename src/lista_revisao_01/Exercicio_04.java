/*
04 - Crie uma classe chamada Pet.
Dê a ela três atributos: nome (String), raca (String) e peso (double).
Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
Atribua valores para os atributos de cada um deles.
Imprima os dados dos dois pets concatenando textos e variáveis.
 */

package lista_revisao_01;

class Pet {
    String nome;
    String raca;
    double peso;
}

public class Exercicio_04 {
    public static void main(String[] args) {
        Pet pet_01 = new Pet();
        pet_01.nome = "Thor";
        pet_01.raca = "Golden Retriever";
        pet_01.peso = 30.5;

        Pet pet_02 = new Pet();
        pet_02.nome = "Luna";
        pet_02.raca = "Siamês";
        pet_02.peso = 4.2;

        System.out.println("Pet 01 --- Nome: " + pet_01.nome + ", Raça: " + pet_01.raca + ", Peso: " + pet_01.peso + "kg");
        System.out.println("Pet 02 --- Nome: " + pet_02.nome + ", Raça: " + pet_02.raca + ", Peso: " + pet_02.peso + "kg");
    }
}
