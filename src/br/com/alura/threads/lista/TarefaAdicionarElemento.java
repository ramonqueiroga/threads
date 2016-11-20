package br.com.alura.threads.lista;

import java.util.List;

/**
 * Created by Ramon Queiroga on 20/11/2016.
 */
public class TarefaAdicionarElemento implements Runnable {

    private List<String> lista;
    private int numeroThread;

    public TarefaAdicionarElemento(List<String> lista, int numeroThread) {
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.lista.add("Thread " + numeroThread + " - " + i);
        }
    }
}
