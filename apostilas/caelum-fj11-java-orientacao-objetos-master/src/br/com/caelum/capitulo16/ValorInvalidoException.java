package br.com.caelum.capitulo16;

//classe Valor herda atributos e metodos da classe RuntimeException
public class ValorInvalidoException extends RuntimeException {
	//metodo para retornar erro de valor
	ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}
}