package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// declarando a interface
public interface Logica {
	// metodos da interface
	String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;

}
