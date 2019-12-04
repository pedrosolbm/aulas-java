package app;

import java.util.Random; //importar a classe random, utilizada para gerar numeros aleatorios

/**
 * Exercicio17 - Gera 50 numero aleatórios entre 1 e 100
 */
public class Exercicio17 {

    public static void main(String[] args) {

        // criar um objeto tipo Random para poder utilizar os metodos da classe Random
        Random rand = new Random();

        // faz o algoritmo rodar 50 vezes (de 0 até 49)
        for (int i = 0; i < 50; i++) {

            // a variável num recebe um numero aleatório entre 0 e 99 e soma 1 ao numero
            // gerado pra ficar entre 1-100;
            int num = rand.nextInt(99) + 1;

            //Mostra o numero gerado na tela
            System.out.println(num);
        }

    }
}