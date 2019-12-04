package app;

public class Exercicio16a{
    public static void main(String[] args){

        //laço de repetição para imprimir os numeros primos
        for (int i = 10; i <= 200; i++) {

            int cont = 0; //declarando e inicializando a variavel cont

            for (int k = 1; k <= i; k++) {

                if (i % k == 0) ++cont;
            }
            if (cont == 2) {

                System.out.println(i);//exibe a mensagem na tela
            }
        }
    } 
}