package br.com.caelum.capitulo05;

public class DesafioFibonacci_5_7 {
	// metodo para calcular fibonacci utilizando um parametro inteiro
	public int[] calculaFibonacci(int n) {
		// declarando um vetor f
		int[] f = new int[n + 1];

		if (n == 0) {
			// se for 0, a posição 0 do vetor recebe 0
			f[0] = 0;
			// retorna o vetor
			return f;
		} else if (n == 1) {
			// se for 1, a posição 0 do vetor recebe 1
			f[0] = 1;
			// retorna o vetor
			return f;
		} else {
			// posições 1(segunda posição) e 2(terceira posição) do vetor receben 1
			f[1] = f[2] = 1;
			// conta de 3 até até o numero passado na função
			for (int i = 3; i <= n; i++) {
				// a posição atual do vetor recebe a a soma (anterior + anterior do anterior)
				f[i] = f[i - 1] + f[i - 2];
			}
			return f; // retorna o vetor
		}
	}
}
