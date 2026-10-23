/*
04 - Crie uma interface Notificacao com o método enviar(String mensagem).
Crie duas classes que implementam ela: Email e SMS. Cada uma imprime de um jeito.
Adicione as duas num ArrayList<Notificacao> e percorra com for-each, enviando a mesma mensagem.

Saída esperada:
E-mail enviado: Sua compra foi aprovada!
SMS enviado: Sua compra foi aprovada!
 */

package atividade_16_interfaces;
import atividade_16_interfaces.model.Email;
import atividade_16_interfaces.model.Notificacao;
import atividade_16_interfaces.model.SMS;
import java.util.ArrayList;

public class Exercicio_04 {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        String mensagem = "Sua compra foi aprovada!";

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar(mensagem);
        }
    }
}
