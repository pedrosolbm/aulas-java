package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.agenda.ConnectionFactory;
import br.com.caelum.agenda.modelo.Contato;

public class ContatoDao {
	// declara um objeto Connection
	private Connection connection;

	// Construtor do Contato Data Access Object
	public ContatoDao(Connection connection) {
		this.connection = connection;
	}

	// tenta gerar a conexão
	public ContatoDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// metodo para adicionar um contato no banco
	public void adiciona(Contato contato) {
		try {
			// String SQL que vai passar as informaÃ§Ãµes pro banco
			String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?,?,?,?)";
			// prepared statement para inserir dados no banco
			PreparedStatement stmt = connection.prepareStatement(sql);
			// define os valores da query
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			// executa a query
			stmt.execute();
			// fecha a conexÃ£o
			stmt.close();
		} catch (SQLException e) {
			// caso haja um erro, mostra o erro
			throw new RuntimeException(e);
		}
	}

	public List<Contato> getLista() {
		try {
			// gera uma ArrayList do tipo Contato
			List<Contato> contatos = new ArrayList<Contato>();
			// prepared statement para seleÃ§Ã£o de dados
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
			// objeto que vai executar a query
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// cria um objeto do tipo Contato
				Contato contato = new Contato();
				// popula o objeto contato
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// popula a data de nascimento do contato, fazendo a conversao
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				// adiciona o contato na lista
				contatos.add(contato);
			}
			// fecha a execução da query
			rs.close();
			// fecha a conexão com o banco
			stmt.close();
			// retorna a lista de contatos
			return contatos;
		} catch (SQLException e) {
			// caso der erro, exibe o erro
			throw new RuntimeException(e);
		}
	}

	// metodo para remover contatos do banco
	public void exclui(Contato contato) {
		// query responsavel pela exclusão
		String sql = "delete from contatos where id=?";
		try {
			// tenta conectar ao banco
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			// passa a query com o id do objeto passado no metodo
			stmt.setLong(1, contato.getId());
			// executa a query
			stmt.execute();
		} catch (SQLException e) {
			// se houver erro, mostrar o erro na tela
			throw new RuntimeException(e);
		}
	}

	// atualiza um contato no banco
	public void atualiza(Contato contato) {
		// query responsavel pela atualização dos dados
		String sql = "update contatos set nome = ?, email = ?, endereco = ?, dataNascimento = ? where id = ?";
		try {
			// tenta conectar ao banco
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			// pega os dados do contato passado como parametro para formar a query
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());

			// executa a query
			stmt.execute();
		} catch (SQLException e) {
			// se houver errro, mostra o erro
			throw new RuntimeException(e);
		}
	}
}
