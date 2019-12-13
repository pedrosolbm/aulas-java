
/*
 * 3. Modifique o código do programa anterior, da seguinte forma:
a) Adicione um atributo que represente o código de barras do produto (é um valor obrigatório e,
portanto, deve ser pedido no construtor);
b) Sobrescreva o método equals() retornando true se dois produtos possuem o mesmo código
de barras;
c) Na classe Loja, implemente um simples procedimento de busca que, dado um produto e um
vetor de produtos, indique em que posição do vetor se encontra o produto especificado ou
imprima que o mesmo não foi encontrado;
d) No método Loja.main(), após a impressão do vetor (feita na questão 2a), escolha um dos 5
produtos e crie duas novas instâncias idênticas a ele: uma com o mesmo código de barras e
outra com o código diferente. Efetue a busca deste produto no vetor utilizando as duas instâncias
e verifique o resultado.
*/
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */
// biblioteca utilizada para criar lista de arrays
import java.util.ArrayList;

//biblioteca utilizada para leitura de dados do usuário
import java.util.Scanner;

//Classe principal
public class Loja {

	static int cod_Barras;

	// Método MAIN
	public static void main(String[] args) {

		// criando uma array list de produtos
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		// utilizando o construdor para inserir dados no objeto
		cd0.dados("Back in Black", 20.00, 10);

		// Criando Cd
		CDs cd1 = new CDs();
		// utilizando o construdor para inserir dados no objeto
		cd1.dados("Zeca Pacodignho, as Melhores", 25.00, 18);

		// Criando dvd
		DVDs dvd0 = new DVDs();
		// utilizando o construdor para inserir dados no objeto
		dvd0.dados("A vida de Stuart Little", 30.00, "2:00");

		// Criando livro
		Livros livro0 = new Livros();
		// utilizando o construdor para inserir dados no objeto
		livro0.dados("Fantástico mundo de Raj", 25.00, "Daniboy");

		// Criando livro
		Livros livro1 = new Livros();
		// utilizando o construdor para inserir dados no objeto
		livro1.dados("Rua sem fim", 35.00, "Rodrigo Tavares");

		// Inclusão dos produtos na Arraylist
		produtos.add(cd0);
		produtos.add(cd1);
		produtos.add(dvd0);
		produtos.add(livro0);
		produtos.add(livro1);

		// Impressão dos produtos já cadastrados
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}

		// Busca do produto
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme o código de barras do produto: ");

		cod_Barras = entrada.nextInt();
		Loja.LocalizaProd(produtos, cod_Barras);
		entrada.close();

		// faz a comparação e verifica se há códigos de barras duplicados
		System.out.println(cd1.equals(cd0));
	}

	// metodo de pesquisa de produtos
	public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras) {
		// procura o produto dentro da arraylist de Produtos
		for (Produto produto : produtos) {
			// se o codigo de barras do peoduto for igual ao codigo de barras digitado
			if (produto.GetCod_Barras() == cod_Barras) {
				// imprime os dados do produto
				System.out.println(produto.toString());
				return;
			}
		}
		System.out.println("Produto não encontrado.");
	}
}
