package app;

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio5 {
    public static void main(String[] args) {
        //começa a executar o codigo verificando se haverá erros
        try {
            //Declara o scanner para ser utilizado na leitura de informação do teclado
            Scanner ler = new Scanner(System.in);
            //exibe a mensagem na tela
            System.out.print("Informe a altura da parede: ");
            double hp = ler.nextDouble();
            //exibe a mensagem na tela
            System.out.print("Informe a largura da parede: ");
            double lp = ler.nextDouble();
            //exibe a mensagem na tela
            System.out.print("Informe a altura do azulejo: ");
            double ha = ler.nextDouble();
            //exibe a mensagem na tela
            System.out.print("Informe a largura da azulejo: ");
            double la = ler.nextDouble();
            //para de esperar entrada de dados pelo teclado
            ler.close();
            double areaParede = hp * lp;//realiza a lógica para encontrar a área da parede
            double areaAzulejo = ha * la;//realiza a lógica para encontrar a área do azulejo

            double qntAzulejo = areaParede/areaAzulejo;
            
            //as linhas a seguir exibem a mensagem na tela
            System.out.printf("Area da parede: %.2fm²\n", areaParede);// Operador "%.2fm²" usado para limitar as casas decimais
            System.out.printf("Area do azulejo: %.2fm²\n", areaAzulejo);// Operador "%.2fm²" usado para limitar as casas decimais
            System.out.printf("Voce precisa de %.0f", qntAzulejo);

        } catch (Exception e) {
            System.out.println("Parametro Invalido!");//exibe a mensagem na tela
        }

    }
}