package br.com.caelum.jdbc.teste.contato;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaUpdateContato {

	public static void main(String[] args) {

		// criando um objeto do tipo Contato
		Contato contato = new Contato();

		// definindo atributos
		contato.setNome("Pedro");
		contato.setEmail("pedrosolbm@gmail.com");
		contato.setEndereco("Rua A 386, Araras");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 1);

		// cria a conexão com o banco
		ContatoDao dao = new ContatoDao();
		// grava as alterações no banco
		dao.altera(contato);
		// imprime uma mensagem
		System.out.println("Contato alterado.");

	}
}
