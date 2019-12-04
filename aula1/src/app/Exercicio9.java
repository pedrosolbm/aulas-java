package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio9 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe o valor de A: ");//exibe a mensagem na tela
            int a = ler.nextInt();//recebe as informações do usuario
            System.out.print("Informe o valor de B: ");//exibe a mensagem na tela
            int b = ler.nextInt();//recebe as informações do usuario
            ler.close();
            
            int aux=a;// lógica para troca das váriaveis
            a=b;
            b=aux;

            System.out.println("A: "+a+"\nB: "+b);//exibe a mensagem na tela
            

        } catch (Exception e) {
             //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");//exibe a mensagem na tela
        }
    }
}