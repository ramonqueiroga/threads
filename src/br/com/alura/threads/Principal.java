package br.com.alura.threads;

import java.math.BigDecimal;

/**
 * Created by Ramon Queiroga on 22/10/2016.
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Runnable imprimeString = new ImprimeString();
        Thread tarefaImprimeString = new Thread(imprimeString);
        tarefaImprimeString.start();
        System.out.println("Executou");
    }
}
