package br.com.residencia.bin.ex9;

public class ImovelNovo extends Imovel {

	double valorAdicional;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public String toString() {
		return "ImovelNovo [Endereco=" + Endereco + ", preco=" + preco + ", valorAdicional=" + valorAdicional + "]";
	}

	public void valorImovelNovo(double valor) {
		valorAdicional += valor;
		
		System.out.println("Esse imovel por ser novo tem um valor adicional de 3%. O preço com o adicional é: R$"+valorAdicional);
		
		
	}
}
