package br.com.caelum.capitulo16;

import br.com.caelum.capitulo16.Conta;
import br.com.caelum.capitulo16.Tributavel;

//classe COnta corrente herda metodos e atributos da classe conta e da interface Tributavel
public class ContaCorrente extends Conta implements Tributavel {

	//sobreescrevendo metodos herdados
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}	
