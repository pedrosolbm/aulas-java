public class Quadrados extends Quadrilateros {

	 public Quadrados(double a) {
		    super(a, 0.0, 0.0, 0.0);
		  }

		  public double getA() {
		    return super.getA();
		  }

		  public double getArea() {
		    return Math.pow(getA(), 2.0);
		  }

		  public double getPerimetro() {
		    return 4.0 * getA();
		  }
}