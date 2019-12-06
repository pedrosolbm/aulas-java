/* 
Escreva um método que recebe um array de números e devolve a posição onde se
encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira
ocorrência. 
*/
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data: 5/12/2019
 */

// importando a biblioteca Scanner para ler informações do usuario via teclado
import java.util.Scanner;

// importa a biblioteca de array para alterar os valores do vetor
import java.lang.reflect.Array;

public class Exercicio9 {

    public static void main(String[] args) {

        // Chamada do metodo
        parImpar();
    }

    // Metodo que vai receber
    public static Integer parImpar() {
        // declaração de variaveis
        Scanner ler = new Scanner(System.in);

        // solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int t = ler.nextInt();

        // o tamnho dos vetores será definido pelo definido pelo usuario
        int vetor[] = new int[t];

        // contador para inserir os numeros no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            vetor[i] = ler.nextInt();
        }

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();

        // Percorre o vetor verificando se o numero é par ou impar
        for (int i = 0; i < vetor.length; i++) {

            // processamento. Se for par, vira 1, se não vira -1
            if ((vetor[i] % 2) == 0) {
                Array.set(vetor, i, 1);
            } else {
                Array.set(vetor, i, -1);
            }
        }

        //imprime o vetor resolvido
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }

        // saida do metodo
        return 0;
    }

}