//classe circulo herda a classe abstrata Forma geométrica
public class Circulo implements FormaGeometrica {

	//declaração de variáveis
	double raio;

	//gets e sets
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	//construtor utilizando variável própria e os métodos da classe pai
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	// sobreescrevendo o método getArea que foi herdado
	public double getArea() {
		return Math.PI * Math.pow(getRaio(), 2.0);
	}

	// sobreescrevendo o método getPerimetro que foi herdado
	public double getPerimetro() {
		return 2.0 * Math.PI * getRaio();
	}
}