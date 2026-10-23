package atividade_16_interfaces.model;

public class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
