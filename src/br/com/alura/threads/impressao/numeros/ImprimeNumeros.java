package br.com.alura.threads.impressao.numeros;

/**
 * Created by Ramon Queiroga on 03/11/2016.
 */
public class ImprimeNumeros {

    public static void main(String[] args) {
        Thread primeira = new Thread(new NumerosRunnable());
        Thread segunda = new Thread(new NumerosRunnable());

        primeira.start();
        segunda.start();
    }

}
