package app;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //começa a executar o codigo verificando se haverá erros
        try {
            //Declara o scanner para ser utilizado na leitura de informação do teclado
            Scanner ler = new Scanner(System.in);
            
            //exibe a mensagem na tela
            System.out.print("Informe a area total do terreno: ");
            
            //"Pega" o que foi digitado pelo usuario e atribui na variavel at
            double at = ler.nextDouble();
            
            //exibe a mensagem na tela
            System.out.print("Informe a area construida do terreno: ");
            
            //"Pega" o que foi digitado pelo usuario e atribui na variavel at
            double ac = ler.nextDouble();

            //para de esperar entrada de dados pelo teclado
            ler.close();

            // area não construida = area total - area construida
            double anc = at - ac;

            //valorConstruido = area construida * 5
            double valorConstruido = ac * 5;

            //valorNaoConstruido = area nao construida * 3.80
            double valorNaoConstruido = anc * 3.80;

            //vai imprimir na tela as informações
            System.out.printf("Total terreno: \t %.2fm²\n", at);
            System.out.printf("Area construida: \t %.2fm² \tPreco: %.2f\n", ac, valorConstruido);
            System.out.printf("Area não construida: \t %.2fm² \tPreco: %.2f\n", anc,valorNaoConstruido);
            System.out.printf("Valor do imposto: \t %.2fm²\n", (valorConstruido+valorNaoConstruido));

           

        } catch (Exception e) { //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");
        }

    }
}