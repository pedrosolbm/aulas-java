/**
 * Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s),
 * que preencha um array com os valores: a) 10 9 8 7 6 5 4 3 2 1
 */
public class Exercicio1b {
    public static void main(String[] args) {

        // declaração do vetor do tipo int com 10 posições (0 até 9)
        int vetor[] = new int[10];

        // contagem regressiva de 9 até 0
        for (int i = 0; i <= 9; i++) {
            // para cada repetição, a posição do vetor vai receber (i*i)
            vetor[i] = i * i;
            System.out.print(vetor[i]+" "); // imprime o valor do vetor
        }
    }
}