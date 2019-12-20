package br.com.caelum.capitulo07;

public class AtualizadorDeContas {
	//declarando variaveis
	private double saldoTotal = 0;
	private double selic;
	
	// metodos
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	//retorna o saldo Total da conta
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	// metodo recebendo um objeto conta para fazer a atualização do saldo
	public void roda(Conta c) {
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo Final: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}
}
