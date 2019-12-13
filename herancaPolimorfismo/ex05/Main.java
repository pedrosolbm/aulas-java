
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

			switch (flag) {
			case 1:

				System.out.println("digite o tamanho do lado do quadrado: ");
				Quadrados q = new Quadrados(entrada.nextDouble());

				fg.add(q);
				break;

			case 2:
				System.out.println("digite o tamanho da base: ");
				double base = entrada.nextDouble();

				System.out.println("digite o valor da altura do retangulo: ");
				double altura = entrada.nextDouble();

				Retangulos r = new Retangulos(base, altura);

				fg.add(r);
				break;

			case 3:

				System.out.println("Digite o raio: ");
				double raio = entrada.nextDouble();
				Circulo c = new Circulo(raio);

				fg.add(c);
			}
		}
		entrada.close();

		for (int i = 0; i < fg.size(); i++) {

			System.out.println("");
			System.out
					.println("O tamanho do perimetro �: " + new DecimalFormat(".##").format(fg.get(i).getPerimetro()));
			System.out.println("O tamanho da area �: " + new DecimalFormat(".##").format(fg.get(i).getArea()));

		}

	}

}
