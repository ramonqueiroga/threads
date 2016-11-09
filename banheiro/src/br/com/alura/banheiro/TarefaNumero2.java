package br.com.alura.banheiro;

/**
 * Created by Ramon Queiroga on 09/11/2016.
 */
public class TarefaNumero2 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        this.banheiro.fazNumero2();
    }
}
