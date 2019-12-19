package br.com.caelum.capitulo07;

public class ContaCorrente extends Conta {
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
}
