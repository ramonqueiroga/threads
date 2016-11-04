package br.com.alura.threads.busca.texto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ramon Queiroga on 03/11/2016.
 */
public class TarefaBuscaNome implements Runnable {

    private String arquivo;
    private String nome;

    public TarefaBuscaNome(String arquivo, String nome) {
        this.arquivo = arquivo;
        this.nome = nome;
    }

    @Override
    public void run() {
        File file = new File(arquivo);
        try (Scanner scanner = new Scanner(file)) {
            int numeroLinha = 1;
            while (scanner.hasNext()) {
                String linha = scanner.nextLine();
                if (linha.toLowerCase().contains(nome.toLowerCase())) {
                    System.out.println(arquivo + " - " + numeroLinha + " - " + linha);
                }
                numeroLinha++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
