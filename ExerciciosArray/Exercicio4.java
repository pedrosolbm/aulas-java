
/**
Crie um método que recebe um array de inteiros e retorna a quantidade de elementos
do array que são números negativos.
 */
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);

        // solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int t = ler.nextInt();

        // o vetor terá um tamanho t definido pelo usuario
        int vetor[] = new int[t];

        // preenche o vetor com os valores digitados pelo usuario
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            vetor[i] = ler.nextInt();
        }

        ler.close();

        // Chama o metodo de contagem de negativos dentro da mensagem
        System.out.println("Você digitou " + retornaNeg(vetor) + " numeros negativos");
    }

    // Metodo para contar os numeros negativos de um dado vetor
    public static Integer retornaNeg(int[] vet) {
        // contador de negativos
        int cont = 0;

        // varre o vetor do inicio até a ultima posição do vetor
        for (int i = 0; i < vet.length; i++) {

            // caso o numero seja negativo, soma 1 ao contador
            if (vet[i] < 0) {
                cont++;
            }
        }

        // retorna a quantidade de numeros negativos
        return cont;
    }
}