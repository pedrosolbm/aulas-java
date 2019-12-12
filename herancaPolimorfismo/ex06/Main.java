package br.com.residencia.bin.ex06;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Gerente g = new Gerente();
		Assistente a = new Assistente();
		AssistenteAdministrativo aa= new AssistenteAdministrativo();
		AssistenteTecnico at = new AssistenteTecnico();
		
		g.setCargo("gerente");
		g.setMatricula(123);
		g.setNome("Mauro");
		g.setSalario(8500.00);
		
		a.setMatricula(321);
		a.setNome("Thalisson");
		a.setSalario(2500.00);
		
		
		aa.setMatricula(234);
		aa.setNome("João");
		aa.setSalario(2500.00);
		aa.setAdicionalNoturno(aa.getSalario()*0.3);
		aa.setTurno("Noturno");
		
		at.setMatricula(432);
		at.setNome("Lucas");
		at.setSalario(2500.00);
		at.setBonusSalarial(at.getSalario()*0.25);
		
		funcionarios.add(at);
		funcionarios.add(a);
		funcionarios.add(aa);
		funcionarios.add(g);
		
		
		for (Funcionario funcionario : funcionarios) {
			
			System.out.println(funcionario.toString()+"\n");
			
		}
		

	}

}
