package app;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        try {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o valor em dolar: $");
        double real = ler.nextDouble();           
        System.out.println("Valor em real: R$" + real * 2.50);
        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }

    }
}