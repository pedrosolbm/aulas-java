/**
 Faça um programa recursivo que calcule a sequencia de Fibonacci.
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 9/12/2019
 */

// importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int sequencia;

        // solicita a quantidade de numeros da sequencia o usuario quer ver
        System.out.print("Quantos numeros da sequencia deseja ver: ");
        sequencia = ler.nextInt();

        // Loop de impressão, imprime a quantidade de numeros solicitada pelo usuario
        for (int i = 1; i <= sequencia; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }

    // função recursiva de fibonacci
    public static int fibonacciRecursivo(int numero) {
        if (numero == 1 || numero == 2) {
            return 1;
        }
        return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
    }
}