package app;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe a comprimento: ");
            double comprimento = ler.nextDouble();
            System.out.print("Informe a largura: ");
            double largura = ler.nextDouble();
            ler.close();
            System.out.printf("Area do retangulo: %.2f\n", (comprimento * largura));
            System.out.printf("Area do retangulo: %.2f\n", ((2*comprimento)+(2*largura)));

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }

    }
}