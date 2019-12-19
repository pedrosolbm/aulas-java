package br.com.caelum.capitulo14;

public class ExercicioGuardadorDeObjetos_14_10_11 {
	private Object[] arrayDeObjetos = new Object[100];
	private int posicao = 0;
	
	public void adicionaObjeto(Object object) {
		this.arrayDeObjetos[this.posicao] = object;
		this.posicao++;
	}
	
	public Object pegaObjeto(int indice) {
		return this.arrayDeObjetos[indice];
	}
}
