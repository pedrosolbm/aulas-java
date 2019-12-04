package app;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        // variaveis
        try {
            int idade = 0; // vai receber a idade
            Scanner ler = new Scanner(System.in); // scanner responsável por ler as informações digitadas
            // entrada das informações
            System.out.printf("Informe a idade: ");
            idade = ler.nextInt(); // idade vai receber a informação digitada pelo usuario
            // processamento
            if (idade < 16) { // Se a idade for menor que 16, informa que não pode votar
                System.out.println("Não pode votar!");
            }
            if (idade == 16 || idade == 17 || idade > 70) { // Se a idade for 16, 17 ou maior que 70 anos.
                System.out.println("Voto facultativo!");
            }
            if (idade >= 18 && idade <= 70) { // se a idade foir maior ou igual a 18 ou menor ou igual a 70
                System.out.println("Voto obrigatorio!");
            }
            ler.close();
        } catch (Exception e) { // se o usuario digitar algo diferente de uma idade entra na exeção
            System.out.println("Idade invalida!"); // mensagem de erro
        }
    } // fim do main
} // fim do algoritmo