//Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s),
//que preencha um array com os valores: c) 3 4 7 12 19 28 39 52 67 84

/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */
public class Exercicio1d {
    public static void main(String[] args) {

        // declaração do vetor do tipo int com 10 posições (0 até 9)
        int vetor[] = new int[10];

        // contador que vai de 0 até a ultima posição do vetor
        for (int i = 0; i < vetor.length; i++) {

            // a posição i do vetor vai receber i ao quadrado +1;
            vetor[i] = i * i + 3;

            // Exibe os valores do vetor
            System.out.print(vetor[i] + " ");
        }

    }
}