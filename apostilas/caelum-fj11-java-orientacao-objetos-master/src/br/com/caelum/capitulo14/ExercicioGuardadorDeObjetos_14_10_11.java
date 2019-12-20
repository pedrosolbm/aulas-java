package br.com.caelum.capitulo14;

// declarando a classe
public class ExercicioGuardadorDeObjetos_14_10_11 {

	//delcarando variaveis
	private int posicao = 0;

	// declarando um vetor do tipo Object
	private Object[] arrayDeObjetos = new Object[100];

	//decalrando metodos da classe
	public void adicionaObjeto(Object object) {
		this.arrayDeObjetos[this.posicao] = object;
		this.posicao++;
	}
	
	public Object pegaObjeto(int indice) {
		return this.arrayDeObjetos[indice];
	}
}
