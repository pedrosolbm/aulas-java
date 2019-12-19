package br.com.caelum.capitulo11;

public class ValorInvalidoException extends RuntimeException {
	ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}
}
