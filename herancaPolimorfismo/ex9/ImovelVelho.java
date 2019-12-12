package br.com.residencia.bin.ex9;

public class ImovelVelho extends Imovel{

	double descontoValor;

	public double getDescontoValor() {
		return descontoValor;
	}

	public void setDescontoValor(double descontoValor) {
		this.descontoValor = descontoValor;
	}
	
	
	
	@Override
	public String toString() {
		return "ImovelVelho [Endereco=" + Endereco + ", preco=" + preco + ", descontoValor=" + descontoValor + "]";
	}

	public void valorImovelVelho(double valor) {
		valor -= descontoValor;
		
		System.out.println("Esse imovel por nao ser novo tem o desconto de 3%. O preço com desconto é: R$"+valor);
		
		
	}
}
