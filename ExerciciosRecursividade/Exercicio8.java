import java.util.Scanner;

/**
 * Escreva uma função recursiva, int SomaSerie (in t i, int j, in t k), que
 * imprime na tela a soma de valores do intervalo [i ,j], com incremento k.
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias Data: 9/12/2019
 */
public class Exercicio8 {

    public static void main(String[] args) {

        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int num;
        int num2;
        int k;
        int resultado;

        // solicita o numero para ser multiplicado
        System.out.print("Digite o 1º numero do intervalo: ");
        num = ler.nextInt();

        // solicita o numero para ser multiplicado
        System.out.print("Digite o 2º numero  do intervalo: ");
        num2 = ler.nextInt();

        //Solicita k
        System.out.print("Digite o informe k: ");
        k = ler.nextInt();

        // chama a função e guarda o resultado na variável
        resultado = somaSerie(num, num2, k);

        System.out.println("Resultado: " + resultado);

    }

    public static Integer somaSerie(int i, int j, int k) {

        // variável que guardará o valor da soma
        int soma = 0;

        // enquanto o valor que i está ssumindo for menor que j
        if (i < j) {
            return soma = i + somaSerie(i + k, j, k);

            // quando chegarmos aqui, só faltará o j a ser adicionado ao nosso valor
            // calculado
        } else {
            // retornamos então o valor da soma de todos os termos antes de j + j
            return soma = soma + j;
        }
    }

}