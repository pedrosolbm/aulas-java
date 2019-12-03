package app;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int [] vendedor = new int[5];
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe a temperatura em Farenheit: ");
            double temperatura = ler.nextDouble();
            ler.close();
            double celsius = (temperatura - 32) * 5 / 9;
            System.out.printf("Temperatura em Celsius: %.2f ºC\n", celsius);

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }
    }
}