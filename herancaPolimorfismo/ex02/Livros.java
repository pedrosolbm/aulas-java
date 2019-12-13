// classe livros herda a classe Produto
public class Livros extends Produto {

	// declarando variáveis próprias
	private String autor;

	// criando construtor
	public void dados (String nome, double preco, String autor){
		// utilizando o construtor herdado da classe pai
		super.dados(nome, preco);
		this.autor = autor;
	}
	
	public String toString(){
		return super.toString() + "\nAutor: " + this.autor;	
	}
}
