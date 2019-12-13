//classe dvds herda a classe produto
public class DVDs extends Produto{

	//declaração de variavel propria
	private String duracao;
	
	//construtor de dados
	public void dados (String nome, double preco, String duracao){
		//utiliza o construtor da classe herdada
		super.dados(nome, preco);
		this.duracao = duracao;
	}

	public String toString(){
		return super.toString() + "\nDuração: " + this.duracao;	
	}	
}
