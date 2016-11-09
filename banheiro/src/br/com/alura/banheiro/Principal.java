package br.com.alura.banheiro;

/**
 * Created by Ramon Queiroga on 09/11/2016.
 */
public class Principal {

    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();
        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Joao");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Ana");
        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Maria");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
    }

}
