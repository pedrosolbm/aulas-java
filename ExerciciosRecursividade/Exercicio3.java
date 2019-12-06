/**
Faça uma função recursiva que calcule o M.D.C. (Máximo divisor comum)
entre dois valores fornecidos pelo usuário. Por exemplo: m.d.c. de 12 e 20 é
4.
 */
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        double divisor;
        double dividendo;
        double resultado;
        
        // Solicita informacao do usuário
        System.out.print("Digite o numero divisor: ");
        divisor = ler.nextDouble();

        // Solicita informacao do usuário
        System.out.print("Digite o numero dividendo: ");
        dividendo = ler.nextDouble();

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();

        // resultado vai receber o valor que o metodo mdc calcular
        resultado = mdc(divisor, dividendo);

        // exibe o resultado
        System.out.println("MDC de " + divisor + " e " + dividendo + " é " + resultado);
    }

    // função de calculo do mdc
    public static double mdc(double dividendo, double divisor) {

        if ((dividendo % divisor == 0)) {
            return divisor;
        } else {
            return mdc(divisor, (dividendo % divisor));
        }
    }

}