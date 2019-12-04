package app;
import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio21{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		try { //começa a executar o codigo verificando se haverá erros

		int linha, coluna, cont = 1; //declara variáveis que serão usadas e inicializa a variável cont

		System.out.println("Coloque o numero de linhas: ");//exibe a mensagem na tela
		linha = ler.nextInt();

		//-------------------Laço de repetição para montar a pirâmide--------//
		while(cont <= linha){
			coluna = 1;
			while(coluna <= cont){
				if (cont < 10) {
					System.out.print("0"+cont+ " ");//exibe a mensagem na tela
					coluna ++;
				}else{
					System.out.print(cont + " ");//exibe a mensagem na tela
					coluna = coluna + 1;
				}
			}
			System.out.println(" ");//exibe a mensagem na tela
			cont ++;
		}
					 //--------------FIM do laço -------------//
					 

		 ler.close();//para de esperar entrada de dados pelo teclado
		
		} catch (Exception e) {
			//se houver erro, vai informar a mensagem abaixo para o usuario
		  	System.out.println("Parametro Invalido!");//exibe a mensagem na tela
		}
	}
}

