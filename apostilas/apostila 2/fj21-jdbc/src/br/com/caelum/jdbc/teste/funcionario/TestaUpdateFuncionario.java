package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaUpdateFuncionario {
	
	public static void main(String[] args){
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rafaela da Mota Queiroz");
		funcionario.setUsuario("rafa");
		funcionario.setSenha("rafa123");
		funcionario.setId((long) 1);
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.altera(funcionario);
		System.out.println("Alterado!");
		
	}
}
