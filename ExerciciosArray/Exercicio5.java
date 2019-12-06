/**
Crie um método que recebe um array de inteiros a e um valor inteiro x e retorna a
quantidade de vezes que x aparece no array a.
 */
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int numero = 0;

        // solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int t = ler.nextInt();

        // o vetor terá um tamanho t definido pelo usuario
        int vetor[] = new int[t];

        // contador para inserir os 10 numeros
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            vetor[i] = ler.nextInt();
        }

        // Solicita ao usuario o numero para ser verificado no vetor
        System.out.print("Digite o numero que gostaria de verificar:");
        numero = ler.nextInt();

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();

        // Chama o metodo de contagem de negativos dentro da mensagem
        System.out.println("Você digitou " + comparaNum(vetor, numero) + " vezes o numero " + numero);
    }

    // Metodo para contar os numeros negativos de um dado vetor
    public static Integer comparaNum(int[] vet, int num) {
        // contador de negativos
        int cont = 0;
        // varre o vetor do inicio até a ultima posição do vetor
        for (int i = 0; i < vet.length; i++) {

            // caso o numero do vetor seja igual ao numero solicitado, soma 1 ao contador
            if (vet[i] == num) {
                cont++;
            }
        }
        // retorna a quantidade de numeros negativos
        return cont;
    }
}