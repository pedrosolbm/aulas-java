import java.util.ArrayList;
import java.util.Scanner;
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
/*ImovelNovo in = new ImovelNovo();
		ImovelVelho iv = new ImovelVelho();
		
		in.setEndereco("Rua dos milion�rios, 777");
		in.setPreco(550300);
		in.setValorAdicional(in.getPreco()*0.03);
		System.out.println(in.toString());
		in.valorImovelNovo(in.getPreco());
		
		
		iv.setEndereco("Rua dos maltrapilhos, 888");
		iv.setPreco(100500);
		iv.setDescontoValor(iv.getPreco()*0.03);
		System.out.println("\n\n"+iv.toString());
		iv.valorImovelVelho(iv.getPreco());*/