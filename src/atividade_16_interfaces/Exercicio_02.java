/*
02 - Agora acrescente a classe Gato, que implementa a mesma interface e
imprime "Miau!". Na main, declare as duas variáveis como Animal:
- Animal bidu = new Cachorro();
- Animal salem = new Gato();
Chame emitirSom() nas duas.
 */

package atividade_16_interfaces;
import atividade_16_interfaces.model.Animal;
import atividade_16_interfaces.model.Cachorro;
import atividade_16_interfaces.model.Gato;

public class Exercicio_02 {
    public static void main(String[] args) {
        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();
    }
}
