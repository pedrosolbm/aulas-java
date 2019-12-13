
/* 6. Implemente a classe Funcionario e a classe Gerente.
crie a classe Assistente, que também é um funcionário, e que possui um número de matrícula
(faça o método GET). Sobrescreva o método exibeDados().
sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes
Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes Tecnico
e Administrativo. */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */
//biblioteca utilizada pra gerar a lista de arrays
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// gerando uma array list de funcionários
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		// gerando um objeto do tipo gerente
		Gerente g = new Gerente();

		// gerando um objeto do tipo assistente
		Assistente a = new Assistente();

		// gerando um objeto do tipo assistente administrativo
		AssistenteAdministrativo aa = new AssistenteAdministrativo();

		// gerando um objeto do tipo assistente tecnico
		AssistenteTecnico at = new AssistenteTecnico();

		// definindo os atributos de gerente
		g.setCargo("gerente");
		g.setMatricula(123);
		g.setNome("Mauro");
		g.setSalario(8500.00);

		// definindo os atributos de assistente
		a.setMatricula(321);
		a.setNome("Thalisson");
		a.setSalario(2500.00);

		// definindo os atributos de assistente administrativo
		aa.setMatricula(234);
		aa.setNome("Jo�o");
		aa.setSalario(2500.00);
		aa.setAdicionalNoturno(aa.getSalario() * 0.3);
		aa.setTurno("Noturno");

		// definindo os atributos de assistente tecnico
		at.setMatricula(432);
		at.setNome("Lucas");
		at.setSalario(2500.00);
		at.setBonusSalarial(at.getSalario() * 0.25);

		// adicionando os funcionarios na lista de funcionarios
		funcionarios.add(at);
		funcionarios.add(a);
		funcionarios.add(aa);
		funcionarios.add(g);

		// percorre a lista de funcionarios
		for (Funcionario funcionario : funcionarios) {
			// imprime as informações dos funcionarios
			System.out.println(funcionario.toString() + "\n");

		}

	}

}
