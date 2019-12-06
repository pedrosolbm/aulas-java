/**
Faça um programa (utilizando recursividade) que peça para o usuário digitar um
número, em seguida, faça a soma de todos os algarismos do número.
Exemplo: 1111 = 1+1+1+1= 4
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data: 5/12/2019
 */

// importando a biblioteca Scanner para ler informações do usuario via teclado
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        // declaração de variaveis
        Scanner ler = new Scanner(System.in);

        // Solicita informacao do usuário
        System.out.print("Digite um numero: ");

        // valor recebe a soma dos digitos do numero que o usuario digitou
        int valor = somaDigitos(ler.nextInt());

        // imprime a mensagem com o resultado
        System.out.println("Soma dos digitos: " + valor);
    }

    // Metodo para checar
    public static Integer somaDigitos(int n) {

        // condição de parada
        if (n == 0)
            return 0;

        // recursividade
        return (n % 10 + somaDigitos(n / 10));
    }
}