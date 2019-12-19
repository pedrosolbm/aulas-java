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
		InputStream is =  new FileInputStream("arquivo.txt");
		Scanner entrada =  new Scanner(is);
		OutputStream os = new FileOutputStream("saida1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
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
