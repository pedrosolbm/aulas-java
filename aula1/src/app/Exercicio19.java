package app;

import java.util.Scanner;

/**
 * Exercicio19
 */
public class Exercicio19 {

    public static void main(String[] args) {

        //Começa a execução do programa esperando por algum erro
        try {
            // criar o objeto scanenr para poder receber as informações digitadas do usuario
            Scanner ler = new Scanner(System.in); 

            int idade; // recebera a idade da pessoa
            int cont = 0; // ira contar o total até 10
            int masc = 0; // ira contar o total de homens
            int fem = 0; // ira contar o tota lde mulheres
            int genero; // recebe o caractere M ou F para tomada de decisão

            // enquanto o o contador for menor que 10, o programa executa o que estiver dentro do while
            while (cont < 10) {
                
                //Solicita o genero da primeira pessoa
                System.out.printf("Digite o genero(Masculino/Feminido) da " + (cont + 1) + "ª pessoa.(M/F): ");
                genero = ler.next().charAt(0); //recebe o caracter digitado pelo usuário

                //confere se o caractere digitado é valido, verificando se foi digitado 'm', 'm', 'f' ou 'F'
                if (genero != 'm' && genero != 'M' && genero != 'f' && genero != 'F') {
                    //se o caractere digitado nao for valido
                    System.out.println("OPÇÃO INVÁLIDA!");// imprime mensagem de erro
                    cont=cont;//não aumenta o contador, pois não foi adicionado uma pessoa
                } 
                //se o caractere digitado for válido
                else {
                    //solicita a idade da pessoa ao usuário
                    System.out.printf("Digite a sua idade: ");
                    idade = ler.nextInt(); //recebe o numero digitado pelo usuario
                    //Se o caracter for 'f' ou 'F' e a idade for maior ou igual a 18
                    if ((genero == 'f' || genero == 'F') && (idade >= 18)) {
                        fem++; //adiciona +1 ao contador de mulheres
                    }
                    //Se o caracter for 'm' ou 'M' e a idade for maior ou igual a 18
                    if ((genero == 'm' || genero == 'M') && (idade >= 18)) {
                        masc++; // soma +1 ao contador de homens
                    }
                    cont++; // soma +1 ao contador de pessoas
                }
            }
            //exibe o total de homens maiores de 18
            System.out.println("Quantidade de homens maiores de idade: " + masc);
            //exibe o total de mulheres maiores de 18
            System.out.println("Quantidade de Mulheres maiores de idade: " + fem);

        } catch (Exception e) {
            //Se o usuário digitar uma idade inválida, o programa gera um erro e apresenta a mensagem abaixo
            System.out.println("Idade invalida");
        }
    }
}