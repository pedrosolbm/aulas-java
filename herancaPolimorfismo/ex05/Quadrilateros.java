package br.com.residencia.bin.ex05;

abstract class Quadrilateros implements FormaGeometrica {

	  private double a;
	  private double b;
	  private double c;
	  private double d;


	  public Quadrilateros(double a, double b, double c, double d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

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
