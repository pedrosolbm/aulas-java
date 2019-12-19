package br.com.caelum.capitulo07;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo Final: " + c.getSaldo());
		saldoTotal += c.getSaldo();
	}
}
