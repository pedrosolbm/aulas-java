/*
Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s),
que preencha um array com os valores: b) 0 1 4 9 16 25 36 49 64 81 100
 */
/*
 * Programadores: Pedro Sol B Montes, Guilherme A. Dias
 * Data: 5/12/2019
 */
public class Exercicio1b {
    public static void main(String[] args) {

        // declaração do vetor do tipo int com 10 posições (0 até 9)
        int vetor[] = new int[10];

        // contagem regressiva de 9 até 0
        for (int i = 0; i <= 9; i++) {
            
            // para cada repetição, a posição do vetor vai receber (i*i)
            vetor[i] = i * i;

            // imprime o valor do vetor
            System.out.print(vetor[i]+" "); 
        }
    }
}