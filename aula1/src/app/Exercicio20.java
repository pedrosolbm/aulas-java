package app;

/**
 * Exercicio20 - mostra primeiros 50 numeros da sequencia de fibonacci
 * 
 */
public class Exercicio20 {

    public static void main(final String[] args) {
        long a = 0;
        long b = 1;
        System.out.println("0"); // exibe o primeiro numero da sequencia
        // rodará o algorítmo 50 vezes
        for (int i = 0; i < 50; i++) {

            System.out.println(b); // imprime o valor da sequencia de fibonacci
            b = b + a; // o valor da sequencia é o valor atual+ o valor anterior
            a = b - a;
        }
    }
}