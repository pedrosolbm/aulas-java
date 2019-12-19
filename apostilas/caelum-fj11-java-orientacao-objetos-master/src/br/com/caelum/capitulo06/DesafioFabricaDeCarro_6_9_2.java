package br.com.caelum.capitulo06;

public class DesafioFabricaDeCarro_6_9_2 {
	public static DesafioFabricaDeCarro_6_9_2 instancia;
	private int fiat;
	private int ford;
	private int volks;
	
	protected DesafioFabricaDeCarro_6_9_2() {
		
	}
	//PADRÃO SINGLETON
	public static DesafioFabricaDeCarro_6_9_2 getInstancia() {
		if (instancia == null) {
			instancia = new DesafioFabricaDeCarro_6_9_2();
		}
		return instancia;
	}
	
	public int getFiat() {
		return fiat;
	}
	public int getFord() {
		return ford;
	}
	public int getVolks() {
		return volks;
	}
	
	public String venderCarroVolks() {
		return new String("Carro Volks #" + this.volks++ + " vendido.");
	}
	
	public String venderCarroFord() {
		return new String("Carro Ford #" + this.ford++ + " vendido.");
	}
	
	public String venderCarroFiat() {
		return new String("Carro Fiat #" + this.fiat++ + " vendido.");
	}
	
	public String gerarRelatorio() {
		return new String("Total de carros vendidos:\nFIAT: " + this.fiat + "\nFORD: " + this.ford + "\nVOLKS: " + this.volks);
	}
}
