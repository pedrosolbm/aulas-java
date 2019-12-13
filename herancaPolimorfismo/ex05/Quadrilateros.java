// classe abstrata Quadrilateros herda os atributos e metodos da classe FormaGeométrica
abstract class Quadrilateros implements FormaGeometrica {

	// declaração de variaveis prórpias
	private double a;
	private double b;
	private double c;
	private double d;

	// declaração de construtor
	public Quadrilateros(double a, double b, double c, double d) {
		// herdando metodos da classe formaGeométrica
		super();
		// definido o valor das variáveis próprias
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	// metodos get e set protegitos
	protected double getA() {
		return a;
	}

	protected double getB() {
		return b;
	}

	protected double getC() {
		return c;
	}

	protected double getD() {
		return d;
	}
}
