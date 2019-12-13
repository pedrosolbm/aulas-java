//classe circulo herda a classe abstrata Forma geométrica
public class Quadrados extends Quadrilateros {

	// construtor
	public Quadrados(double a) {

		// utilizando variavel propria e variaveis herdadas de Quadrilateros
		super(a, 0.0, 0.0, 0.0);
	}

	//metodo para retornar o valor da variável a
	public double getA() {

		// utiliza o metodo getA herdado da classe pai
		return super.getA();
	}

	// sobreescrevendo o método getArea que foi herdado
	public double getArea() {
		return Math.pow(getA(), 2.0);
	}

	// sobreescrevendo o método getPerimetro que foi herdado
	public double getPerimetro() {
		return 4.0 * getA();
	}
}