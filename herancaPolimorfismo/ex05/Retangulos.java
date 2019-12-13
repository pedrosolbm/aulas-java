// classe retangulos herda os atributos e metodos da classe Quadrilateros
public class Retangulos extends Quadrilateros {

	// construtor utilizando variáveis próprias
	public Retangulos(double base, double altura) {
		// utilizando o construtor herdado da classe pai
		super(0.0, base, altura, 0.0);
	}

	// metodos para retornar a base
	public double getBase() {
		// utiliza o metodo herdado da classe pai
		return super.getB();
	}

	// metodos para retornar a altura
	public double getAltura() {
		// utiliza o metodo herdado da classe pai
		return super.getC();
	}

	// metodo para retornar a Area
	public double getArea() {
		// utiliza os dois métodos próprios para fazer a conta
		return getBase() * getAltura();
	}

	// metodo para retornar o perímetro
	public double getPerimetro() {
		// utiliza os dois métodos próprios para fazer a conta
		return 2.0 * getBase() * getAltura();
	}
}