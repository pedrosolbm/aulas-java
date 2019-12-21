package br.com.caelum.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	// retorna uma nova conexÃ£o
	public Connection getConnection() throws SQLException {
		System.out.println("Iniciando");

		try {
			// registra o novo driver jdbc
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// se der erro, informa o erro
			throw new SQLException(e);
		}
		// retorna a conexão com o banco de dados
		return DriverManager.getConnection("jdbc:mysql://localhost/fj21",
				"root", "mysql");
	}

}
