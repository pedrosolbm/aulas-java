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
// biblioteca utilizada para criar lista de arrays
import java.util.ArrayList;

//biblioteca utilizada para leitura de dados do usuário
import java.util.Scanner;

//Classe principal
public class Loja {

	public static void main(String[] args) {
		
		//criando uma array list de produtos
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		//Criando Cd
		CDs cd0 = new CDs();

		// utilizando o construdor para inserir dados no objeto
		cd0.dados("Back in Black", 20.00, 10);
		
		//Criando Cd
		CDs cd1 = new CDs();
		// utilizando o construdor para inserir dados no objeto
		cd1.dados("Zeca Pacodignho, as Melhores", 25.00, 18);
	
		//Criando dvd
		DVDs dvd0 = new DVDs();
		// utilizando o construdor para inserir dados no objeto
		dvd0.dados("A vida de Stuart Little", 30.00, "2:00");
		
		//Criando livro
		Livros livro0 = new Livros();
		// utilizando o construdor para inserir dados no objeto
		livro0.dados("Fantástico mundo de Raj", 25.00, "Daniboy");
		
		//Criando livro
		Livros livro1 = new Livros();
		// utilizando o construdor para inserir dados no objeto
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
