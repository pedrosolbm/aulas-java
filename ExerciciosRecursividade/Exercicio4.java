/**
Faça uma função recursiva que calcule o M.D.C. pelo algoritmo de Euclides.
Por exemplo, divide-se a por b e obtém-se o quociente q e o resto r. Se r for
zero, b é o m.d.c.; se não for, divide-se b por r e assim sucessivamente até
encontra r um resto zero. O último divisor é o M.D.C.
 */
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio4aaaa {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int divisor;
        int dividendo;
        int resultado;

        // Solicita informacao do usuário
        System.out.print("Digite o numero divisor: ");
        divisor = ler.nextInt();

        // Solicita informacao do usuário
        System.out.print("Digite o numero dividendo: ");
        dividendo = ler.nextInt();

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();

        // resultado vai receber o valor que o metodo mdc calcular
        resultado = mdcEuclides(divisor, dividendo);

        // exibe o resultado
        System.out.println("MDC de " + divisor + " e " + dividendo + " é " + resultado);
    }

    // função para calcular o mdc com algoritmo de Euclides de Euclides recursivo
    public static int mdcEuclides(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdcEuclides(b, a % b);
    }

}