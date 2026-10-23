/*
01 - Crie uma interface Animal com o método emitirSom().
Crie a classe Cachorro que implementa ela e imprime "Au au!".
Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
 */

package atividade_16_interfaces;
import atividade_16_interfaces.model.Cachorro;

public class Exercicio_01 {
    public static void main(String[] args) {
        Cachorro snoopy = new Cachorro();
        snoopy.emitirSom();
    }
}
