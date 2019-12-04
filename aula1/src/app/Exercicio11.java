package app;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        // variaveis
        double liq = 0; // salario liquido
        double porcLiq = 0; // porcentagem do salario liquido
        double bruto = 0; // salario bruto
        double descontos; // descontos
        double emprest; // emprestimo
        Scanner ler = new Scanner(System.in); // scanner responsável por ler as informações digitadas

        // entrada das informações
        System.out.printf("Informe o valor bruto do salario: ");
        bruto = ler.nextDouble();

        System.out.printf("Informe o valor dos descontos: ");
        descontos = ler.nextDouble();

        System.out.printf("Informe o valor do emprestimos desejado: ");
        emprest = ler.nextDouble();

        // processamento
        liq = bruto - descontos; // salario liquido = salario bruto - descontos
        porcLiq = ((liq - emprest) / bruto); // porcentagem do liquido = (liquido - empresto)/ bruto
        // tomada de decisao
        if (porcLiq >= 0.3) {
            System.out.println("Emprestimo autorizado");
        } else {
            System.out.println("Emprestimo NÃO autorizado");
        }
        ler.close();
    } // fim do main
} // fim do algoritmo