package br.com.caelum.capitulo10;

//classe SeguroDeVida herda metodos da Interface Tributável
public class SeguroDeVida implements Tributavel {

	//sobreescrevendo metodos herdados
	@Override
	public double calculaTributos() {
		return 42;
	}

}
