/*
 * Faça uma função recursiva que realize a multiplicação entre dois valores int,
 * sem utilizar o operador *.
*/

/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 9/12/2019
 */

// importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int num;
        int num2;
        int resultado;

        // solicita o numero para ser multiplicado
        System.out.print("Digite o 1º numero: ");
        num = ler.nextInt();

        // solicita o numero para ser multiplicado
        System.out.print("Digite o 2º numero: ");
        num2 = ler.nextInt();

        // chama a função e guarda o resultado na variável
        resultado = multiplicar(num, num2);

        System.out.println("Resultado: " + resultado);
    }

    // chamada da função recursiva de multiplicação
    public static Integer multiplicar(int x, int y) {
        // condição de parada
        if (y == 1) {
            return x;
        } else {
            return x + multiplicar(x, y - 1);
        }
        // fim da função multiplicacao
    }

}