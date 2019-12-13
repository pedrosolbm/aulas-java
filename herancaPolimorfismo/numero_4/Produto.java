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

public class Produto implements Comparable {
	
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