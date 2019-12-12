package br.com.residencia.bin.ex08;

public class CamaroteInferior extends VIP{
	
	String localizacao;

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void imprimeLocalizacao() {
		System.out.println(localizacao);
	}

}
