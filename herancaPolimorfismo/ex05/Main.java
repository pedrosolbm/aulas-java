import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ArrayList<FormaGeometrica> fg = new ArrayList<FormaGeometrica>();
		
		System.out.println("digite quantas formas deja criar: ");
		int numFormas = entrada.nextInt();
		
		for(int i=0; i<numFormas; i++) {
			System.out.println("digite 1 para criar um quadrado\ndigite 2 para criar um retangulo\n "
							   + "digite 3 para criar um circulo\n");
			int flag = entrada.nextInt();
			
			switch(flag) {
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
		
		for (int i = 0; i<fg.size(); i++) {
			
			System.out.println("");
			System.out.println("O tamanho do perimetro �: "+new DecimalFormat(".##").format(fg.get(i).getPerimetro()));
			System.out.println("O tamanho da area �: "+new DecimalFormat(".##").format(fg.get(i).getArea()));
			
			
		}
		
	}

}
