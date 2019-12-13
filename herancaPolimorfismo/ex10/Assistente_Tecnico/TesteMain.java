/* 
 * Crie uma classe de Teste com o método main. Neste método:
crie um assistente administrativo e um técnico. Imprima o número de matrícula e o nome de cada
um deles.
crie um animal do tipo cachorro e faça-o latir. Crie um gato e faça-o miar. Faça os dois animais
caminharem.
teste (como quiser) as classes Rica, Pobre e Miseravel.
crie um ingresso. Peça para o usuário digitar 1 para normal e 2 para VIP. Conforme a escolha do
usuário, diga se o ingresso é do tipo normal ou VIP. Se for VIP, peça para ele digitar 1 para

camarote superior e 2 para camarote inferior. Conforme a escolha do usuário, diga se que o VIP
é camarote superior ou inferior. Imprima o valor do ingresso.
crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a definição do
usuário, imprima o valor final do imóvel.
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:13/12/2019
 */

import java.util.ArrayList;
import java.util.Scanner; //importando a classe scanner para pegar informações do usuário
public class TesteMain {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

System.out.println("Faca uma escolha :\n");
System.out.println("1. Assistente e Tecnico  \n"+
				   "2. Brinque com seu animal  \n" +
				   "3. Veja sua situacao financeira  \n" +
				   "4. Escolha seu Ingresso  \n" +
				   "5. Imobiliaria  \n");

		int Num = ler.nextInt();
		
		switch (Num) {
			case 1:
			ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
			Tecnico tecnico = new Tecnico();
			Assistente assistente = new Assistente();
	
			tecnico.setMatricula(234);
			tecnico.setNome("Jo�o");
		
			tecnico.setMatricula(123);
			tecnico.setNome("Mauro");
	
			assistente.setMatricula(432);
			assistente.setNome("Lucas");
			
			assistente.setMatricula(321);
			assistente.setNome("Thalisson");	
			
			funcionarios.add(assistente);
			funcionarios.add(tecnico);
			funcionarios.add(assistente);
			funcionarios.add(tecnico);
			
			
			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario.toString()+"\n");
			}
		
			   break;
			   
			   case 2:
			   Cachorro cachorroAnimal = new Cachorro();
			   Gato  gatoAnimal = new Gato();

			   gatoAnimal.setSom ("miauu");
			   cachorroAnimal.setSom ("ruuff");

			   gatoAnimal.getSom();
			   cachorroAnimal.getSom();

			   break;
		
			default:
				System.out.println("Faca uma escolha de novo :");
			break;
		}

	}
		
}