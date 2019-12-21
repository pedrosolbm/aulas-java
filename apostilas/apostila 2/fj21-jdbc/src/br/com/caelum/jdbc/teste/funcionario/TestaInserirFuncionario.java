package br.com.caelum.jdbc.teste.funcionario;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInserirFuncionario {
		
	public static void main(String[] args){
		//pronto pra gravar
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Rafaela");
		funcionario.setUsuario("rafa");
		funcionario.setSenha("rafa123");
			
		//grave nessa conexão
		FuncionarioDao dao = new FuncionarioDao();
		dao.adiciona(funcionario);
			
		System.out.println("Gravado!");
	}
}
