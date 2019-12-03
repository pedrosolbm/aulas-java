package app;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe o valor de A: ");
            int a = ler.nextInt();
            System.out.print("Informe o valor de B: ");
            int b = ler.nextInt();
            ler.close();
            
            int aux=a;
            a=b;
            b=aux;

            System.out.println("A: "+a+"\nB: "+b);
            

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }
    }
}