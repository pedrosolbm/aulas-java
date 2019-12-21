package br.com.caelum.capitulo15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Exercicio_15_8_6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//variavel is receberá os dados do arquivos
		InputStream is =  new FileInputStream("arquivo.txt");

		// variavel do tipo scanner vai receber o valor da variavel IS
		Scanner entrada =  new Scanner(is);
		
		// enquanto a entrada tiver uma proxima linha
		while (entrada.hasNextLine()) {
			//imprime o que houver na linha
			System.out.println(entrada.nextLine());
		}
		//fecha o arquivo
		entrada.close();
	}
}