package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         //começa a executar o codigo verificando se haverá erros
        try {
            System.out.println("Informe o valor da primeira venda:");//exibe a mensagem na tela
            float num1 = ler.nextFloat();//recebe as informações do usuario
            System.out.println("Informe o valor da segunda venda:");//exibe a mensagem na tela
            float num2 = ler.nextFloat();//recebe as informações do usuario
            System.out.println("Informe o valor da terceira venda:");//exibe a mensagem na tela
            float num3 = ler.nextFloat();//recebe as informações do usuario
            System.out.println("Informe o valor da quarta venda:");//exibe a mensagem na tela
            float num4 = ler.nextFloat();//recebe as informações do usuario

            float com1 = ((num1*10)/100);// lógica para o calculo da comissão
            float com2 = ((num2*10)/100);// lógica para o calculo da comissão
            float com3 = ((num3*10)/100);// lógica para o calculo da comissão
            float com4 = ((num4*10)/100);// lógica para o calculo da comissão


            System.out.println("A comissão do primeiro vendedor é : R$ "+(com1));//exibe a mensagem na tela
            System.out.println("A comissão do segundo vendedor é : R$ "+(com2));//exibe a mensagem na tela
            System.out.println("A comissão do terceiro vendedor é: R$ "+(com3));//exibe a mensagem na tela
            System.out.println("A comissão do quarto vendedor é: R$ "+(com4));//exibe a mensagem na tela
            ler.close();
        } 
        catch (Exception e) {
             //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");//exibe a mensagem na tela
        }
    }
}