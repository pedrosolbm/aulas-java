/*
 * Escreva um trecho Java que leia 10 valores double do teclado
 * e armazene-os num array d.
*/

/* 
  * Programadores: Pedro Sol B Montes, Guilherme A. Dias
  * Data: 5/12/2019
*/

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio3 {
    public static void main(String[] args) {

        // declaração do vetor do tipo int com 10 posições (0 até 9)
        double d[] = new double[10];

        // Declara o scanner para ser utilizado na leitura de informação do teclado
        Scanner ler = new Scanner(System.in);

        // exibe a mensagem na tela
        System.out.println("Informe 10 valores :");

        // contagem regressiva de 9 até 0
        for (int i = 0; i < 10; i++) {

            // "Pega" o que foi digitado pelo usuario e atribui na variavel real
            double valor = ler.nextDouble();

            d[i] = valor;
        }
        for (int i = 0; i < 10; i++) {
            // imprime o valor do vetor
            System.out.print(d[i] + " ");
        }
    }
}

// para cada repetição, a posição do vetor vai receber (i + 1)