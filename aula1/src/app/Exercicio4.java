package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio4 {
    public static void main(String[] args) {
        //começa a executar o codigo verificando se haverá erros
        try {
            //Declara o scanner para ser utilizado na leitura de informação do teclado
            Scanner ler = new Scanner(System.in);
            double vetor[] = new double[4];//declara um vetor de 4 posições
            double media=0;// declara e inicializa a variavel
            for(int i=0; i<4;i++){
                //exibe a mensagem na tela e realiza uma lógica para informar tambem qual nota está
                System.out.print("Digite a nota "+(i+1)+":");
                vetor[i]=ler.nextDouble();// armazena a nota no vetor
                media += vetor[i];//lógica para a média
            }
            //para de esperar entrada de dados pelo teclado
            ler.close();
            //exibe a mensagem na tela e realiza
            System.out.printf("Media: %.2f\n", (media/4));

        } catch (Exception e) {
            //se houver erro, vai informar a mensagem abaixo para o usuario
            System.out.println("Parametro Invalido!");
        }

    }
}