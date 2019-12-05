/* 
Escreva um método que recebe um array de números e devolve a posição onde se
encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira
ocorrência. 
*/
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data: 5/12/2019
 */

/**
 * Exercicio7
 */
// importando a biblioteca Scanner para ler informações do usuario via teclado
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        // Chamada do metodo
        maiorValor();
    }

    // Metodo que vai receber
    public static Integer maiorValor() {
        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        int maior;
        int pos = 0;
        // solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int t = ler.nextInt();

        // o vetor terá um tamanho t definido pelo usuario
        int vetor[] = new int[t];

        // contador para inserir os numeros no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            vetor[i] = ler.nextInt();
        }

        // a variavel maior recebe o primeiro valor do vetor para comparação futura
        maior = vetor[0];

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();

        // Percorre o vetor procurando o maior valor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                pos = i;
            }
        }

        // Mensagem com as informações solicitadas
        System.out.println("O maior valor é " + maior + " na " + (pos + 1) + "ª posição ");

        //retorna a posicao e sai do metodo
        return pos;
    }

}