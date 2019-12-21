package br.com.caelum.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio_15_8_3 {

	public static void main(String[] args) throws IOException {
		// variavel is receberá o que tiver escrito no arquivo.txt
		InputStream is = new FileInputStream("arquivo.txt");

		// isr vai ler o que for recebido pela variável is
		InputStreamReader isr = new InputStreamReader(is);

		// armazena ficar o que for lido pela variavel isr
		BufferedReader br = new BufferedReader(isr);

		// a variável linha receberá o que for lido pelo teclado
		String linha = br.readLine();

		// enquanto a variável linha for diferente de nulo
		while (linha != null) {
			// imprime o que houver na linha
			System.out.println(linha);
			linha = br.readLine();
		}
		// fecha o arquivo
		br.close();
	}

}
