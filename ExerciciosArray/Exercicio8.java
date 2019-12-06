
/**
* Faça um método que devolve um array de números inteiros lidos do teclado
*/
/**
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 5/12/2019
 */

//importar a biblioteca scanner para leitura de dados via teclado
import java.util.Scanner;

public class Exercicio8{

    public static void main(String[] args) {

        //chama o método criado abaixo;
        retornaNum();
        }

    // Metodo para contar os numeros negativos de um dado vetor
    public static Integer retornaNum() {
        
        Scanner ler = new Scanner(System.in);
        
        // declaração do vetor
        int vetor[] = new int[10];

        // contador para inserir os 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            vetor[i] = ler.nextInt();
        }


        for (int i = 0; i < 10; i++) {
            // imprime o valor do vetor
            System.out.print(vetor[i] + " ");
        }

        //saida do método
        return 0;
    }
}