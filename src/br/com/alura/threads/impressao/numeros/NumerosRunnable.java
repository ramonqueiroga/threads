package br.com.alura.threads.impressao.numeros;

/**
 * Created by Ramon Queiroga on 03/11/2016.
 */
public class NumerosRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            Thread threadAtual = Thread.currentThread();
            System.out.println("Numero: " + i + " - " + "Thread id: " + threadAtual.getId());
        }
    }
}
