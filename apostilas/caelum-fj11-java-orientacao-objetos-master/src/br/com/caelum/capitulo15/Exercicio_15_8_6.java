package br.com.caelum.capitulo15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio_15_8_6 {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is =  new FileInputStream("arquivo.txt");
		Scanner entrada =  new Scanner(is);
		
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		entrada.close();
	}

}
