/*
 *4. Ainda modificando o código do programa anterior, faça com que Produto implemente a interface
Comparable, e implemente a comparação por nome. Ao final do método Loja.main(), ordene o vetor
utilizando o método java.util.Arrays.sort() e imprima-o novamente. Depois altere a implementação da
comparação para ordenar por preço e verifique o resultado. 

Programadores: Daniel Gastardelli e Tiago Marques
Data: 13/12/2019
 */

package numero_4;

//Importando biblioteca para listar vetor

import java.util.ArrayList;

//Importando bibliotecas para fazer requisições ao usuário

import java.util.Scanner;

//Classe principal
public class Loja {
	
	static int cod_Barras;
	
	//Método MAIN
	public static void main(String[] args) {
		
		//Criação do Array de produtos
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		//Cadastro de produtos
		CDs cd0 = new CDs(789789789);
		cd0.dados("Nenhum de nós", 20.00, 10);
		//cod_Barras antigo 456456456
		CDs cd1 = new CDs(789789789);
		cd1.dados("Dazaranha", 25.00, 18);
	
		DVDs dvd0 = new DVDs(123123123);
		dvd0.dados("A espera de um milagre", 30.00, "2:00");
		
		Livros livro0 = new Livros(741741741);
		livro0.dados("As aventuras de PI", 25.00, "Yann Martel");
		
		Livros livro1 = new Livros(258258258);
		livro1.dados("Dom Casmurro", 35.00, "Machado de Assis");
		
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
		
		//Comparação por nome
		System.out.println("\nComparação é igual a " + cd0.compareTo("Nenhum de nós"));
		//resultado será 0(false) porque o nome está sendo iniciado com letra minúscula
		System.out.println("Comparação é igual a " + cd1.compareTo("dazaranha"));
		System.out.println("Comparação é igual a " + dvd0.compareTo("A espera de um milagre"));
		System.out.println("Comparação é igual a " + livro0.compareTo("As aventuras de PI"));
		//resultado será 0(false) porque o nome(Dom) está faltando a letra 'm'
		System.out.println("Comparação é igual a " + livro1.compareTo("Do Casmurro"));
			
		//Busca do produto
		Scanner entrada = new Scanner(System.in);
		System.out.println("\nInforme o código de barras do produto: ");
		
		cod_Barras = entrada.nextInt();
		Loja.LocalizaProd(produtos, cod_Barras);
		entrada.close();
		
		//faz a comparação e verifica se há códigos de barras duplicados
		System.out.println(cd1.equals(cd0));
	}
	
	public static void LocalizaProd(ArrayList<Produto> produtos, int cod_Barras)
	{
		for (Produto produto : produtos){
			if (produto.GetCod_Barras() == cod_Barras){
				System.out.println(produto.toString());
				return;
			}							
		}
		System.out.println("Produto não encontrado.");
	}	
}
