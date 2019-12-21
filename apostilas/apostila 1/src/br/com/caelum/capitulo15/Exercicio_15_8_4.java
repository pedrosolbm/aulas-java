package br.com.caelum.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio_15_8_4 {

	public static void main(String[] args) throws IOException {

		// variavel is receberá a entrada de dados via teclado
		// isr vai ler o que for recebido pela variável is
		// armazena ficar o que for lido pela variavel isr
		// armazena ficar o que for lido pela variavel isr
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		// a variável linha receberá o que for lido na variável br
		String linha = br.readLine();

		//enquanto a variável linha for diferente de nulo
		while (linha != null) {
			//imprime o que houver na linha
			System.out.println(linha);
			linha = br.readLine();
		}
		//fecha o arquivo
		br.close();
	}

}
