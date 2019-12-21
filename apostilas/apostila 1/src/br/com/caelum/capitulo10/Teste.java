package br.com.caelum.capitulo10;

public class Teste {
	public static void main(String[] args) {
		// declarando um metodo da classe Retangulo passando base 2 e altura 2
		AreaCalculavel a = new Retangulo(2, 2);

		// imprime a area do retangulo
		System.out.println(a.CalculaArea());
	}
}
