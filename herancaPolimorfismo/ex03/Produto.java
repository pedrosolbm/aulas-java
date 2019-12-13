//classe produto
public class Produto{
	
	//declarando variaveis proprias
	private String nome;
	private double preco;
	private int cod_Barras;
	
	//Método construtor
	public Produto (int cod_Barras){
		this.cod_Barras = cod_Barras;
	}
	
	//Método que recebe os dados do produto
	public void dados (String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	//Sobrescrita do metodo toString
	public String toString(){
		return "\nCodigo de Barra: " + this.cod_Barras
				+  "\nNome: " + this.nome +
				"\nPreco: " + this.preco;	
	}
	
	//Metodo que pega o codigo de barras, pois o atributo é privado
	public int GetCod_Barras(){
		return this.cod_Barras;
	}
	
	@Override
	//método usado para comparação do código de barras
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (cod_Barras != other.cod_Barras)
			return false;
		return true;
	}

	@Override
	public int compareTo(String nome) {
		if (this.nome.equals(nome)) {
			return 1;
		} else {
			return 0;
		}
	}
}
