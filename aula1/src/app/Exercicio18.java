package app;

import java.util.Random; //importar a classe random, utilizada para gerar numeros aleatorios
import java.util.Scanner; //importar a classe scanner para pegar informações do usuário

/**
 * Exercicio18
 */
public class Exercicio18 {

    public static void main(String[] args) {

        // criar um objeto Random para poder utilizar os metodos da classe Random
        Random rand = new Random();

        // criar o objeto scanenr para poder receber as informações digitadas do usuario
        Scanner ler = new Scanner(System.in);

        int valor = 0; // valor é o numero digitado pelo usuario
        int tentativa = 0; // vai contar quantas vezes o usuario tentou até acertar

        // numero vai receber o numero aleatório entre 0 e 99 e somar 1 pra ficar 1-100
        int numero = rand.nextInt(99) + 1;

        //Imprime uma mensagem
        System.out.println("Descubra o numero entre 1 e 100!");
        
        //Enquanto o valor que o usuario digitar for diferente do numero gerado, o programa continua rodando
        while (valor != numero) {
            
            //Imprime uma mensagem solicitando para digitar um numero
            System.out.printf("Digite um numero: ");
            //Le o numero digitado
            valor = ler.nextInt();

            if (valor < numero) { // se o valor digitado for menor que o numero
                System.out.println("O valor é maior que " + valor); //Imprime a mensagem com a dica
                tentativa++; // soma 1 ao contador de tentativas tentativa++ como se fosse tentativa=tentativa+1
            }
            if (valor > numero) { // se o valor digitado for menor que o numero
                System.out.println("O valor é menor que " + valor); //Imprime a mensagem com a dica
                tentativa++;// soma 1 ao contador de tentativas
            }
            if (valor == numero) {
                System.out.println("Você acertou!"); //Imprime a mensagem de sucesso
                tentativa++;// soma 1 ao contador de tentativas
                System.out.println("Tentativas: " + tentativa); //Imprime a mensagem com a dica
            }

        }

    }
}