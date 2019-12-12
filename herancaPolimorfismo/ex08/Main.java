package br.com.residencia.bin.ex08;

public class Main {

	public static void main(String[] args) {
	
		
		Ingresso ingresso = new Ingresso();
		Normal normal = new Normal();
		VIP vip = new VIP();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();
		
		ingresso.setValor(120.00);
		
		normal.setValor(120.00);
		normal.imprimeIngressoNormal();
		System.out.println();
		
		vip.setAdicionalVip(40);
		vip.imprimeIngressoVip(normal.getValor());
		
		ci.setLocalizacao("O camarote Inferior fica no segundo andar sala 3b");
		ci.imprimeLocalizacao();
		System.out.println();
		
		cs.setMasterVip(50);
		cs.imprimeMasterVip(vip.getAdicionalVip());
		
		
		
		
		
	}	
}
