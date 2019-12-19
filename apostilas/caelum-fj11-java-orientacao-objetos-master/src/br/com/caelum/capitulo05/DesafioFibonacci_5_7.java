package br.com.caelum.capitulo05;

public class DesafioFibonacci_5_7 {
	public int[] calculaFibonacci(int n) {
		int[] f = new int[n+1];
		if (n == 0) {
			f[0] = 0;
			return f;
		} else if (n == 1) {
			f[0] = 1;
			return f;
		} else {
			f[1] = f[2] = 1;
			for (int i = 3; i <= n; i++) {
				f[i] = f[i-1] + f[i-2];
			}
			return f;
		}
	}
}
