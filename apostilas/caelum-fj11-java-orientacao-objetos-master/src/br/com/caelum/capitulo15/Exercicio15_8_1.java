package br.com.caelum.capitulo15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio15_8_1 {

	public static void main(String[] args) throws IOException {
		InputStream is =  System.in;
		InputStreamReader isr =  new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Digite sua mensagem:");
		String linha = br.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
	}

}
