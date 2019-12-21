package br.com.caelum.capitulo15;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Exercicio_15_8_7 {

	public static void main(String[] args) throws IOException {
		
		//variavel is receberá os dados do arquivo.txt
		InputStream is =  new FileInputStream("arquivo.txt");
		// variavel do tipo scanner vai receber o valor da variavel IS
		Scanner entrada =  new Scanner(is);
		
		// variável os aponta para o arquivo saida1.txt
		OutputStream os = new FileOutputStream("saida1.txt");

		// variável osw vai escrever no arquivo saida1.txt
		OutputStreamWriter osw = new OutputStreamWriter(os);

		//
		BufferedWriter bw = new BufferedWriter(osw); 
		
		while (entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			bw.write(linha);
			bw.newLine();
		}
		bw.close();
		entrada.close();
	}

}
