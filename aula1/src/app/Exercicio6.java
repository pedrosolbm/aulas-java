package app;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe a area total do terreno: ");
            double at = ler.nextDouble();
            System.out.print("Informe a area construida do terreno: ");
            double ac = ler.nextDouble();

            

            System.out.printf("Area da parede: %.2fm²\n", areaParede);
           

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }

    }
}