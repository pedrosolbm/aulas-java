	package br.com.residencia.bin.ex07;

public class Main {

	public static void main(String[] args) {


		Automovel a = new Automovel();
		
		a.setAno(2000);
		a.setAro(23);
		a.setCavalos(500);
		a.setCor("preto");
		a.setNumPortas(4);
		a.setQtdRodas(4);
		a.setTipo("Carro");
		
		a.listarVerificações();
		System.out.println();
		
		a.limpar();
		System.out.println();
		
		a.ajustar();
		System.out.println();
		
		a.mudarOleo();
		System.out.println();
		
		Bicicleta b =new Bicicleta();
		
		b.setAno(2019);
		b.setAro(30);
		b.setCor("verde");
		b.setNumMarchas(30);
		b.setQtdRodas(2);
		b.setTipo("speed");
		
		b.listarVerificações();
		System.out.println();
		
		b.limpar();
		System.out.println();
		
		b.ajustar();
		System.out.println();
		
		b.mudarOleo();
		

	}

}
