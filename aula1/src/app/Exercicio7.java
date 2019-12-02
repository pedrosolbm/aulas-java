package app;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio7 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe o raio: ");
            double raio = ler.nextDouble();
            System.out.print("Informe a altura: ");
            double altura = ler.nextDouble();
            ler.close();
            double volume = Math.PI * raio * raio * altura;
            System.out.printf("Volume: %.2f\n", volume);

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }
    }
}