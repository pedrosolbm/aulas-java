package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {

	// testa a conexão com o banco de dados
	public static void main(String[] args) throws SQLException{
		
		// tenta criar uma conexão com o banco
		Connection connection = new ConnectionFactory().getConnection();
		// se conseguir criar, imprime uma mensagem
		System.out.println("Conexao aberta!");
		// fecha a conexão
		connection.close();
	}
}
