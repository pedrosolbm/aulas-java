package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio8 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe a temperatura em Farenheit: ");//exibe a mensagem na tela
            double temperatura = ler.nextDouble();//recebe as informações do usuario
            ler.close();
            // lógica para realizar a converção da temperatura
            double celsius = (temperatura - 32) * 5 / 9;
            System.out.printf("Temperatura em Celsius: %.2f ºC\n", celsius);//exibe a mensagem na tela

        } catch (Exception e) {
             //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");
        }
    }
}