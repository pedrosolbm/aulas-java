package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaExcluirFuncionario {
	
	public static void main(String[] args){
		
		// Cria um objeto do tipo Funcionário
		Funcionario funcionario = new Funcionario();
		// define o Id do funcionário a ser excuido
		funcionario.setId((long) 1);
		
		// Cria um objeto do tipo Funcionário
		FuncionarioDao dao = new FuncionarioDao();
		// remove o funcionário do banco
		dao.remove(funcionario);
		
		// imprime a mensagem de sucesso
		System.out.println("Excluido com sucesso.");
		
	}
}
