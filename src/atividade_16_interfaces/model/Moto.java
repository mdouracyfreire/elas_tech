package atividade_16_interfaces.model;

public class Moto implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Moto ligada!");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }
}
