package br.com.caelum.jdbc.teste.funcionario;

import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaListaFuncionario {
	
public static void main(String[] args){
		
		FuncionarioDao dao = new FuncionarioDao();
		List<Funcionario> funcionarios = dao.getLista();
		
		for(Funcionario funcionario : funcionarios){
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Usuário: " + funcionario.getUsuario());
			System.out.println("Senha: " + funcionario.getSenha() + "\n");
		}
	}
}
