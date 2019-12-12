public class Retangulos extends Quadrilateros {

	
	public Retangulos(double base, double altura) {
	    super(0.0, base, altura, 0.0);
	  }

	  public double getBase() {
	    return super.getB();
	  }

	  public double getAltura() {
	    return super.getC();
	  }

	  public double getArea() {
	    return getBase() * getAltura();
	  }

	  public double getPerimetro() {
	    return 2.0 * getBase() * getAltura();
	  }
	}