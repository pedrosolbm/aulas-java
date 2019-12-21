package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDao {

	// declara um objeto Connection
	private Connection connection;

	// Contato Data Access Object
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	// metodo para adicionar um contato no banco
	public void adiciona(Contato contato) {
		// String SQL que vai passar as informações pro banco
		String sql = "insert into contatos (nome,email,endereco,dataNascimento) values(?,?,?,?)";
		try {
			// prepared statement para inserir dados no banco
			PreparedStatement stmt = connection.prepareStatement(sql);

			// define os valores da query
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			// executa a query
			stmt.execute();
			// fecha a conexão
			stmt.close();
		} catch (Exception e) {
			// caso haja um erro, mostra o erro
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getLista() {
		try {
			// gera uma ArrayList do tipo Contato
			List<Contato> contatos = new ArrayList<Contato>();
			
			// prepared statement para seleção de dados
			PreparedStatement stmt = this.connection.prepareStatement("Select * from contatos");
			
			// vai executar a query
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// cria um objeto do tipo Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data atraves do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				// adicionando o objeto na lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Contato contato) {
		String sql = "update contatos set nome=?, email=?, endereco=?, dataNascimento=? where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Contato contato) {

		try {
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");

			stmt.setLong(1, contato.getId());

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
