package br.com.alura.threads.busca.texto;

/**
 * Created by Ramon Queiroga on 03/11/2016.
 */
public class Buscador {

    public static void main(String[] args) {
        String nomeAutor = "da";
        Thread assinaturas1 = new Thread(new TarefaBuscaNome("assinaturas1.txt", nomeAutor));
        Thread assinaturas2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nomeAutor));
        Thread autores = new Thread(new TarefaBuscaNome("autores.txt", nomeAutor));

        assinaturas1.start();
        assinaturas2.start();
        autores.start();
    }

}
