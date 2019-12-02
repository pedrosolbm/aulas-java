package app;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);
            System.out.print("Informe a altura da parede: ");
            double hp = ler.nextDouble();
            System.out.print("Informe a largura da parede: ");
            double lp = ler.nextDouble();
            System.out.print("Informe a altura do azulejo: ");
            double ha = ler.nextDouble();
            System.out.print("Informe a largura da azulejo: ");
            double la = ler.nextDouble();
            ler.close();
            double areaParede = hp * lp;
            double areaAzulejo = ha * la;

            double qntAzulejo = areaParede/areaAzulejo;

            System.out.printf("Area da parede: %.2fm²\n", areaParede);
            System.out.printf("Area do azulejo: %.2fm²\n", areaAzulejo);
            System.out.printf("Voce precisa de %.0f", qntAzulejo);

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");
        }

    }
}