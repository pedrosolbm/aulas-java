package br.com.caelum.jdbc.teste.contato;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaListaContato {

	public static void main(String[] args) {

		// cria uma conexão
		ContatoDao dao = new ContatoDao();

		// cria uma lista de contatos
		List<Contato> contatos = dao.getLista();

		// enquanto existe um contato na lista de Contatos
		for (Contato contato : contatos) {
			// imprime a mensagem informando os dados do contato
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endere�o: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}
	}
}
