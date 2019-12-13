/* 7. Criar uma estrutura hierárquica que contenha as seguintes classes:
Veiculo (classe abstracta), Bicicleta e Automóvel.
Os métodos da classe Veiculo são todos abstractos e possuem a seguinte assinatura:
• listarVerificacoes() • ajustar()
• limpar()
Estes métodos são implementados nas subclasses Automóvel e Bicicleta.
Acrescentar na classe Automóvel o método mudarOleo() */

/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */

public class Main {

	public static void main(String[] args) {

		// criando um objeto do tipo automovel
		Automovel a = new Automovel();

		// atribuindo valor aos atributos do automóvel
		a.setAno(2000);
		a.setAro(23);
		a.setCavalos(500);
		a.setCor("preto");
		a.setNumPortas(4);
		a.setQtdRodas(4);
		a.setTipo("Carro");

		// utilizando metodo do objeto automovel
		a.listarVerificacoes();

		// utilizando metodo do objeto automovel
		a.limpar();

		// utilizando metodo do objeto automovel
		a.ajustar();

		// utilizando metodo do objeto automovel
		a.mudarOleo();

		// criando um objeto do tipo bicicleta
		Bicicleta b = new Bicicleta();

		// atribuindo valor aos atributos de bicicleta
		b.setAno(2019);
		b.setAro(30);
		b.setCor("verde");
		b.setNumMarchas(30);
		b.setQtdRodas(2);
		b.setTipo("speed");

		// utilizando metodo do objeto bicicleta
		b.listarVerificacoeses();

		// utilizando metodo do objeto bicicleta
		b.limpar();

		// utilizando metodo do objeto bicicleta
		b.ajustar();

		// utilizando metodo do objeto bicicleta
		b.mudarOleo();

	}

}
