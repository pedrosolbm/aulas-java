package br.com.caelum.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

// classe ListaContatosLogic herda metodos da Interface Logica
public class ListaContatosLogic implements Logica{

	// sobreescrevendo um metodo herdado da interface
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		List<Contato> contatos = new ContatoDao().getLista();
		
		req.setAttribute("contatos", contatos);
		
		return "lista-contatos.jsp";
	}

}
