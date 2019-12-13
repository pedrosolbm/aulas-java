/*
 * 2. Crie uma hierarquia de classes de domínio para uma loja que venda livros, CDs e DVDs. Sobrescreva
o método toString() para que imprima:
Para livros: nome, preço e autor;
Para CDs: nome, preço e número de faixas;
Para DVDs: nome, preço e duração.
Evite ao máximo repetição de código utilizando a palavra super no construtor e no método
sobrescrito. Em seguida, crie uma classe Loja com o método main() que adicione 5 produtos
diferentes (a sua escolha) a um vetor e, por fim, imprima o conteúdo do vetor.

Programadores: Eduardo e Daiana
Data: 11/12/2019
 */

public class DVDs extends Produto{

	//decarando variavel propria
	private String duracao;
	
	//metodo construtor
	public DVDs(int cod_Barras) {
		super(cod_Barras);
	}
	//Método que recebe os dados do produto
	public void dados (String nome, double preco, String duracao){
		//herda o construtor  da classe pai
		super.dados(nome, preco);
		this.duracao = duracao;
	}

	//Sobrescrita do metodo toString
	public String toString(){
		return super.toString() + "\nDuração: " + this.duracao;	
	}	
}