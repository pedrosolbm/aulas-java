package br.com.residencia.bin.ex08;

public class CamaroteSuperior extends VIP {

	
	double masterVip;

	public double getMasterVip() {
		return masterVip;
	}

	public void setMasterVip(double masterVip) {
		this.masterVip = masterVip;
	}
	
	public void imprimeMasterVip(double valor) {
		masterVip += valor;
		System.out.println("Master VIP --> O valor do ingresso é: R$"+masterVip+" reais");
	}
	
}
