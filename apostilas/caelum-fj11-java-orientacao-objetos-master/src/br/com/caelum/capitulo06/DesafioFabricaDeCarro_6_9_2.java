package br.com.caelum.capitulo06;

//declaranado a classe DesafioFabricaDeCarro_6_9_2
public class DesafioFabricaDeCarro_6_9_2 {

	//declarando um objeto publico do tipo DesafioFabricaDeCarro_6_9_2
	public static DesafioFabricaDeCarro_6_9_2 instancia;
	// declarando variaveis
	private int fiat;
	private int ford;
	private int volks;
	
	// declarando metodo protegido
	protected DesafioFabricaDeCarro_6_9_2() {
		
	}

	//Singleton pattern
	public static DesafioFabricaDeCarro_6_9_2 getInstancia() {
		if (instancia == null) {
			instancia = new DesafioFabricaDeCarro_6_9_2();
		}
		return instancia;
	}
	//gets
	public int getFiat() {
		return fiat;
	}
	public int getFord() {
		return ford;
	}
	public int getVolks() {
		return volks;
	}
	//retorna uma string com o carro que foi vendido
	public String venderCarroVolks() {
		return new String("Carro Volks #" + this.volks++ + " vendido.");
	}
	//retorna uma string com o carro que foi vendido
	public String venderCarroFord() {
		return new String("Carro Ford #" + this.ford++ + " vendido.");
	}
	//retorna uma string com o carro que foi vendido
	public String venderCarroFiat() {
		return new String("Carro Fiat #" + this.fiat++ + " vendido.");
	}
	//retorna uma string com a quantidade de carros vendidos
	public String gerarRelatorio() {
		return new String("Total de carros vendidos:\nFIAT: " + this.fiat + "\nFORD: " + this.ford + "\nVOLKS: " + this.volks);
	}
}
