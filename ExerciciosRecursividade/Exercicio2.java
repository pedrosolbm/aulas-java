/* 
Faça uma função recursiva para elevar um valor base a potência do valor
expoente. 
*/
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int num;
        int pow;

        // Solicita informacao do usuário
        System.out.print("Digite a base: ");
        num = ler.nextInt();

        // Solicita informacao do usuário
        System.out.print("Digite a potencia: ");
        pow = ler.nextInt();

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();

        // exibe o resultado
        System.out.println("Resultado: " + exp(pow, num));

    }

    // Metodo recursivo para calcular a potencia de um numero
    public static Integer exp(int pow, int num) {
        if (pow < 1)
            return 1;
        else
            return num * exp(pow - 1, num);
    }

}