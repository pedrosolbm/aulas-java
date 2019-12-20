package br.com.caelum.capitulo07;

//classe ContaPoupança herda metodos e atributos de Conta
public class ContaPoupanca extends Conta {

	// sobreescrevendo metodo herdado de Conta
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 3);
	}
}
