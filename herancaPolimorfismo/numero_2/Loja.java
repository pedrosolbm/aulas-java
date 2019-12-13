/*
 * 2. Crie uma hierarquia de classes de domínio para uma loja que venda livros, CDs e DVDs. Sobrescreva
o método toString() para que imprima:
Para livros: nome, preço e autor;
Para CDs: nome, preço e número de faixas;
Para DVDs: nome, preço e duração.
Evite ao máximo repetição de código utilizando a palavra super no construtor e no método
sobrescrito. Em seguida, crie uma classe Loja com o método main() que adicione 5 produtos
diferentes (a sua escolha) a um vetor e, por fim, imprima o conteúdo do vetor.

Programadores: Daniel Gastardelli e Tiago Marques
Data: 11/12/2019
 */

package numero_2;

import java.util.ArrayList;
import java.util.Scanner;

//Classe principal
public class Loja {
	
	//Método MAIN
	public static void main(String[] args) {
		
		//Criação do Array de produtos
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		//Cadastro de produtos
		CDs cd0 = new CDs;
		cd0.dados("Ousadia e alegria", 20.00, 10);
		CDs cd1 = new CDs;
		cd1.dados("Mentiras", 25.00, 18);
	
		DVDs dvd0 = new DVDs;
		dvd0.dados("A vida de Stuart Little", 30.00, "2:00");
		
		Livros livro0 = new Livros;
		livro0.dados("Fantástico mundo de Raj", 25.00, "Daniboy");
		
		Livros livro1 = new Livros;
		livro1.dados("Rua sem fim", 35.00, "Rodrigo Tavares");
		
		//Inclusão dos produtos na Arraylist
		produtos.add(cd0);		
		produtos.add(cd1);
		produtos.add(dvd0);
		produtos.add(livro0);
		produtos.add(livro1);		
		
		//Impressão dos produtos já cadastrados
		for (Produto produto : produtos){
			System.out.println(produto.toString());
		}
			
}
