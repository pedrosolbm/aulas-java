package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio2 {
    public static void main(String[] args) {
        //começa a executar o codigo verificando se haverá erros
        try {
            //Declara o scanner para ser utilizado na leitura de informação do teclado
            Scanner ler = new Scanner(System.in);
            //exibe a mensagem na tela
            System.out.print("Informe seu peso: ");
            double peso = ler.nextDouble();//recebe ovalor digitado
            //exibe a mensagem na tela
            System.out.print("Informe sua altura: ");
            double altura = ler.nextDouble();// recebe o valor digitado

            ler.close();//para de esperar entrada de dados pelo teclado

            //exibe a mensagem na tela e faz a lógica para o calculo do Indice de Masssa Corporal
            System.out.printf("IMC: %.2f", (peso / (altura * altura)));

        } catch (Exception e) {
            //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");
        }

    }
}