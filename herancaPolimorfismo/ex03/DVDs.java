//classe dvds herda a classe produto
public class DVDs extends Produto{

	//declaração de variavel propria
	private String duracao;
	
	// construtor
	public DVDs(int cod_Barras) {
		// herdando o construtor da classe pai
		super(cod_Barras);
	}
	//construtor de dados
	public void dados (String nome, double preco, String duracao){
		//utiliza o construtor da classe herdada
		super.dados(nome, preco);
		this.duracao = duracao;
	}

	//Sobrescrita do metodo toString
	public String toString(){
		return super.toString() + "\nDuração: " + this.duracao;	
	}	
}
