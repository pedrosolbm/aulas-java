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

package exQuatro;

//Classe feita com objetivo de instanciar um produto do tipo CD
public class CDs extends Produto{

	private int num_Faixas = 0;
	//Metodo construtor
	public CDs(int cod_Barras) {
		super(cod_Barras);
	}

	//Método criado para coletar as caracteristicas do objeto
	public void dados (String nome, double preco, int num_Faixas){
		super.dados(nome, preco);
		this.num_Faixas = num_Faixas;
	}

	//Sobrescrita do metodo toString
	public String toString(){
		return super.toString() + "\nNúmero de faixas: " + this.num_Faixas;	
	}
}