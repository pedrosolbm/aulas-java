package br.com.residencia.bin.ex05;

public class Circulo implements FormaGeometrica {

	double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getArea() {
		return Math.PI * Math.pow(getRaio(), 2.0);
	}

	public double getPerimetro() {
		return 2.0 * Math.PI * getRaio();
	}
}