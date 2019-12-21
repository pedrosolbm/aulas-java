package br.com.caelum.jdbc.teste.contato;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaExcluirContato {

	public static void main(String[] args) {

		// cria um objeto do tipo Contato
		Contato contato = new Contato();
		// define um Id para o contato
		contato.setId((long) 2);

		// cria um objeto do tipo Contato
		ContatoDao dao = new ContatoDao();
		// define um Id para o contato
		dao.remove(contato);

		// imprime a mensagem
		System.out.println("Excluído com sucesso");

	}

}
