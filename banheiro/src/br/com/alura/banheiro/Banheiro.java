package br.com.alura.banheiro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Ramon Queiroga on 09/11/2016.
 */
public class Banheiro {

    private Lock lock = new ReentrantLock();

    public void fazNumero1() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " batendo na porta");
        lock.lock();
            System.out.println(nome + " Entrando no banheiro");
            System.out.println(nome + " fazendo coisa rapida");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + "dando descarda");
            System.out.println(nome + " saindo do banheiro");
        lock.unlock();
    }

    public void fazNumero2() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " batendo na porta");
        lock.lock();
            System.out.println(nome + " Entrando no banheiro");
            System.out.println(nome + " fazendo coisa demorada");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarda");
            System.out.println(nome + " saindo do banheiro");
        lock.unlock();
    }

}
