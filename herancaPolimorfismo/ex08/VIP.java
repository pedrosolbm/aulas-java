package br.com.residencia.bin.ex08;

public class VIP extends Ingresso{
	
	double adicionalVip;

	public double getAdicionalVip() {
		return adicionalVip;
	}

	public void setAdicionalVip(double adicionalVip) {
		this.adicionalVip = adicionalVip;
	}

	
	public void imprimeIngressoVip(double valor) {
		adicionalVip += valor;
		System.out.println("Ingresso VIP --> O preço do ingresso é: R$"+adicionalVip+" reais");
	}
	

}
