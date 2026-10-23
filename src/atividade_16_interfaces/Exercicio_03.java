/*
03 - Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
e percorra com for-each chamando emitirSom(). Repare que não
tem nenhum if. Dica: animais.add(new Cachorro());
 */

package atividade_16_interfaces;
import atividade_16_interfaces.model.Animal;
import atividade_16_interfaces.model.Cachorro;
import atividade_16_interfaces.model.Gato;
import java.util.ArrayList;

public class Exercicio_03 {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
