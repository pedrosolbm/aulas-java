/*
Escreva um trecho Java que exiba os valores de um array a double numa mesma
linha.
*/

/* 
  * Programadores: Pedro Sol B Montes, Guilherme A. Dias
  * Data: 5/12/2019
*/
public class Exercicio2 {
    public static void main(String[] args) {

        // declaração do vetor do tipo int com 10 posições (0 até 9)
        double a[] = new double[10];

        // contagem regressiva de 9 até 0
        for (int i = 0; i <= 9; i++) {
            // para cada repetição, a posição do vetor vai receber (i + 1)
            a[i] = i + 1;
            // imprime o valor do vetor
            System.out.print(a[i] + " ");
        }
    }
}