/*
Faça um programa que receba um valor n, e imprima a contagem
regressiva a partir deste valor. Por exemplo, se o usuário digitar 5, o
programa irá imprimir 5, 4, 3, 2, 1, 0. 
*/
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

/**
 * Exercicio5
 */
public class Exercicio5 {
    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int num;

        // Solicita um numero ao usuário
        System.out.print("Digite o numero: ");
        num = ler.nextInt();

        // chamada da função passando o numero digitado
        regressivo(num);
    }

    //função para contagem regressiva recursiva
    public static void regressivo(int n) {
        if (n == 0) {
            System.out.print(n);
        } else {
            System.out.print(n + " ");
            regressivo(n - 1);
        }
    }

}