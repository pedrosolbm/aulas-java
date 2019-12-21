package br.com.caelum.capitulo09;

import br.com.caelum.capitulo07.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}
	
	public void roda(Conta c) {
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo Final: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}
}
