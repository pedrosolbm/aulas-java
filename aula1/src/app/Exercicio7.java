package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário
import java.lang.Math;//importando a classe Math para utilizar nos calculos

public class Exercicio7 {
    public static void main(String[] args) {
        //começa a executar o codigo verificando se haverá erros
        try {
            Scanner ler = new Scanner(System.in);//Declara o scanner para ser utilizado na leitura de informação do teclado
            
            System.out.print("Informe o raio: "); //exibe a mensagem na tela
            //recebe as informações do usuario
            double raio = ler.nextDouble();
            System.out.print("Informe a altura: "); //exibe a mensagem na tela
            //recebe as informações do usuario
            double altura = ler.nextDouble();
            //para de esperar entrada de dados pelo teclado
            ler.close();
            // lógica para calcular o volume 
            double volume = Math.PI * raio * raio * altura;
            System.out.printf("Volume: %.2f\n", volume); //exibe a mensagem na tela

        } catch (Exception e) {
            //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");
        }
    }
}