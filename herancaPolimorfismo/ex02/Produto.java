//criando classe produto
public class Produto {

	// criando variaveis próprias
	private String nome;
	private double preco;

	// Método que recebe os dados do produto
	public void dados(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Sobrescrita do metodo toString
	public String toString() {
		return "\nNome: " + this.nome + "\nPreco: " + this.preco;
	}

}
