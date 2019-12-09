/**
 Faça um programa recursivo que calcule o fatorial de um número qualquer.
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 9/12/2019
 */

// importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        // declaração de variáveis
        Scanner ler = new Scanner(System.in);
        int num;
        int resultado;

        //Solicita entrada de dados via teclado
        System.out.print("Digite um numero: ");
        num = ler.nextInt();

        //Armazena o retorno da função recursiva na variável resultado
        resultado = fatorial(num);

        //Imprime o resultado na tela
        System.out.println("O fatorial de " + num + " é " + resultado);

    }
    //função recursiva para calculo de fatorial
    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);

    }
}