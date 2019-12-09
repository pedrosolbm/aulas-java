/* 
Faça uma função recursiva que recebe um vetor preenchi do e a quantidade de
posições deste vetor, e retorna a soma de todos os elementos do veto r.
*/
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 9/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio6aaa {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        // solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int t = ler.nextInt();

        // o tamnho dos vetores será definido pelo definido pelo usuario
        double vetor[] = new double[t];

        // contador para inserir os numeros no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            vetor[i] = ler.nextDouble();
        }

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();

        // a variável resultado recebe o resultado da função de soma
        double resultado = somar(vetor, vetor.length);

        // Exibe a mensagem na tela
        System.out.println("Resultado: " + resultado);

    }

    // Função recursiva para soma de vetores
    public static Double somar(double vetor[], int tamanho) {
        if (tamanho > 0) {
            double soma = vetor[tamanho - 1] + somar(vetor, tamanho - 1);
            return soma;
        } else {
            return 0.0;
        }
    }
}