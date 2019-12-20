package br.com.caelum.capitulo11;

/* a classe ValorInvalidoException herda metodos e atributos da classe RuntimeException
RuntimeException é uma biblioteca padrão do Java */
public class ValorInvalidoException extends RuntimeException {
	ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}
}
