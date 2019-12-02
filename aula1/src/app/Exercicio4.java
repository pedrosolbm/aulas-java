package app;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            double vetor[] = new double[4];
            double media=0;
            for(int i=0; i<4;i++){
                
                System.out.print("Digite a nota "+(i+1)+":");
                vetor[i]=ler.nextDouble();
                media += vetor[i];
            }
            System.out.printf("Media: %.2f\n", (media/4));

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }

    }
}