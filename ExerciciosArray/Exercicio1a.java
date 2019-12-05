/**
 * Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s),
 * que preencha um array com os valores: a) 10 9 8 7 6 5 4 3 2 1
 */
public class Exercicio1a {
    public static void main(String[] args) {

        int vetor[] = new int[10]; // declaração do vetor do tipo int com 10 posições (0 até 9)

        for (int i = 9; i >= 0; i--) { // contagem regressiva de 9 até 0
            vetor[i] = i + 1; // para cada repetição, o vetor receberá o numero da repetição + 1
            System.out.print(vetor[i]+" "); // imprime o valor do vetor
        }

    }
}