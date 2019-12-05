/*
Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s),
que preencha um array com os valores: a) 10 9 8 7 6 5 4 3 2 1
 */
/*
Programadores: Pedro Sol B. Montes, Guilherme A. Dias
Data: 5/12/2019
*/
public class Exercicio1a {
    public static void main(String[] args) {

        // declaração do vetor do tipo int com 10 posições (0 até 9)
        int vetor[] = new int[10];

        // contagem regressiva de 9 até 0
        for (int i = 9; i >= 0; i--) {

            // para cada repetição, o vetor receberá o numero da repetição + 1
            vetor[i] = i + 1;

            // imprime o valor do vetor
            System.out.print(vetor[i] + " ");
        }

    }
}