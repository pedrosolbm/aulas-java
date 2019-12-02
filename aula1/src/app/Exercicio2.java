package app;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe seu peso: ");
            double peso = ler.nextDouble();
            System.out.print("Informe sua altura: ");
            double altura = ler.nextDouble();

            System.out.printf("IMC: %.2f", (peso / (altura * altura)));

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }

    }
}