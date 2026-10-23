/*
05 - Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
Crie Carro e Moto implementando os dois.
Coloque numa lista e percorra com for-each chamando os dois métodos em cada um.
 */

package atividade_16_interfaces;
import atividade_16_interfaces.model.Carro;
import atividade_16_interfaces.model.Moto;
import atividade_16_interfaces.model.Veiculo;
import java.util.ArrayList;

public class Exercicio_05 {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}
