package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio3 {
    public static void main(String[] args) {
        //começa a executar o codigo verificando se haverá erros
        try {
            //Declara o scanner para ser utilizado na leitura de informação do teclado
            Scanner ler = new Scanner(System.in);
            //exibe a mensagem na tela
            System.out.print("Informe a comprimento: ");
            double comprimento = ler.nextDouble();//recebe a informação digitada
            //exibe a mensagem na tela
            System.out.print("Informe a largura: ");
            double largura = ler.nextDouble();//recebe a informação digitada

            ler.close();//para de esperar entrada de dados pelo teclado

            //exibe a mensagem na tela e faz o calculo da area do retangulo
            System.out.printf("Area do retangulo: %.2f\n", (comprimento * largura));
            //exibe a mensagem na tela e faz o calculo da area do perimetro do retangulo
            System.out.printf("Area do perimetro do retangulo: %.2f\n", ((2*comprimento)+(2*largura)));

        } catch (Exception e) {
            //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");
        }

    }
}