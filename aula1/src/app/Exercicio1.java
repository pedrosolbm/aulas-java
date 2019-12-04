package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio1 {
    public static void main(String[] args) {
        //começa a executar o codigo verificando se haverá erros
        try {
        //Declara o scanner para ser utilizado na leitura de informação do teclado
        Scanner ler = new Scanner(System.in);
        //exibe a mensagem na tela
        System.out.print("Informe o valor em dolar: $");
        //"Pega" o que foi digitado pelo usuario e atribui na variavel real
        double real = ler.nextDouble();   
        //para de esperar entrada de dados pelo teclado
        ler.close();  
        //exibe a mensagem na tela e realiza a lógica da converção monetária
        System.out.println("Valor em real: R$" + real * 2.50);
        } catch (Exception e) {
            //exibe a mensagem na tela
            System.out.println("Parametro Invalido!");
        }

    }
}