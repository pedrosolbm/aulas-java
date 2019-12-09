/**
 * Faça uma função recursiva que dado um número decimal imprima a sua
 * representação binária corretamente.
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 9/12/2019
 */

// importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int num;

        //Solicita o numero ao usuario
        System.out.print("Digite o numero para ser convertido: ");
        num = ler.nextInt();

        //IMprime o resultado
        System.out.println("Decimal: " + num);
        System.out.print("Binario: ");
        
        //Chamada do metodo, que retorna o numero convertido para binario
        decimalToBin(num);
        
    }
    //função recursiva para conversão de decimal para binario
    public static void decimalToBin(int num) {
        if (num > 0) {
            decimalToBin(num / 2);
            System.out.print(num % 2);
        }
    }
} 