package br.com.alura.banheiro;

/**
 * Created by Ramon Queiroga on 09/11/2016.
 */
public class TarefaNumero1 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero1(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazNumero1();
    }
}
