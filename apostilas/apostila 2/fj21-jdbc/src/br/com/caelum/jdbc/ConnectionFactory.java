package br.com.caelum.jdbc;

import java.sql.*;

public class ConnectionFactory {
	
	// retorna uma nova conexão
	public Connection getConnection(){
		try{
			// registra o novo driver jdbc
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// faz a conexão passando o caminho do banco, usuário, senha
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fj21", "root", "mysql");
		} catch (SQLException e){
			// caso não consiga gerar a conexão, informa o erro
			throw new RuntimeException(e);
		}
	}
}
