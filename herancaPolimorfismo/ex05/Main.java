/* 5. Crie a seguinte hierarquia de classes:
Uma interface para representar qualquer forma geométrica, definindo métodos para cálculo do
perímetro e cálculo da área da forma;
Uma classe abstrata para representar quadriláteros. Seu construtor deve receber os tamanhos
dos 4 lados e o método de cálculo do perímetro já pode ser implementado;
Classes para representar retângulos e quadrados. A primeira deve receber o tamanho da base e
da altura no construtor, enquanto a segunda deve receber apenas o tamanho do lado;
Uma classe para representar um círculo. Seu construtor deve receber o tamanho do raio.
No programa principal, pergunte ao usuário quantas formas ele deseja criar. Em seguida, para
cada forma, pergunte se deseja criar um quadrado, um retângulos ou um círculo, solicitando os
dados necessários para criar a forma. Todas as formas criadas devem ser armazenadas em um
vetor. Finalmente, imprima: (a) os dados (lados ou raio); (b) os perímetros; e (c) as áreas de

todas as formas. Para (b) e (c), tire vantagem do polimorfismo, enquanto que para (a) utilize
instanceof e downcast. */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */

//biblioteca Decimal format necessaria para formatar valores para decimal
import java.text.DecimalFormat;

//biblioteca utilizada pra gerar a lista de arrays
import java.util.ArrayList;

//biblioteca utilizada para leitura de dados via teclado
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// criando um objeto do tipo scanner
		Scanner entrada = new Scanner(System.in);

		// crianto um objeto fg que será uma arraylist de formas geométricas
		ArrayList<FormaGeometrica> fg = new ArrayList<FormaGeometrica>();

		// solicita dados ao usuário
		System.out.println("digite quantas formas deja criar: ");
		int numFormas = entrada.nextInt();

		// cria N formas geométricas, de acordo com o valor que o usuário passou
		// anteriormente
		for (int i = 0; i < numFormas; i++) {
			// solicita a forma que o usuário quer criar
			System.out.println("digite 1 para criar um quadrado\ndigite 2 para criar um retangulo\n "
					+ "digite 3 para criar um circulo\n");
			int flag = entrada.nextInt();

			// entra na opção que o usuário digitar
			switch (flag) {
			case 1:

				// solicita informações do usuario
				System.out.println("digite o tamanho do lado do quadrado: ");

				// gera um objeto valor de entrada do usuário
				Quadrados q = new Quadrados(entrada.nextDouble());

				// adiciona o objeto ao vetor de arrays
				fg.add(q);

				// sai do switch
				break;

			case 2:
				// solicita informações do usuario
				System.out.println("digite o tamanho da base: ");
				double base = entrada.nextDouble();

				System.out.println("digite o valor da altura do retangulo: ");
				double altura = entrada.nextDouble();
				// gera um objeto valor de entrada do usuário
				Retangulos r = new Retangulos(base, altura);

				// adiciona o objeto ao vetor de arrays
				fg.add(r);
				// sai do switch

				break;

			case 3:
				// solicita informações do usuario
				System.out.println("Digite o raio: ");
				double raio = entrada.nextDouble();

				// gera um objeto valor de entrada do usuário
				Circulo c = new Circulo(raio);

				// adiciona o objeto ao vetor de arrays
				fg.add(c);

				// sai do switch
				break;
			}
		}
		// fecha a leitura de dados
		entrada.close();
		// percorre o vetor fazendo o calculo de area e perimetro das formas
		for (int i = 0; i < fg.size(); i++) {

			System.out.println("");
			System.out.println("O tamanho do perimetro: " + new DecimalFormat(".##").format(fg.get(i).getPerimetro()));
			System.out.println("O tamanho da area: " + new DecimalFormat(".##").format(fg.get(i).getArea()));

		}

	}

}
