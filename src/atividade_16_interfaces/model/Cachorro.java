package atividade_16_interfaces.model;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
