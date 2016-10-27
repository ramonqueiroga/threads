package br.com.alura.threads;

/**
 * Created by Ramon Queiroga on 26/10/2016.
 */
public class ImprimeString implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Imprimindo String");
    }
}
