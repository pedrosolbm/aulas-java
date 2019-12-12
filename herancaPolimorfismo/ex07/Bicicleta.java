package br.com.residencia.bin.ex07;

public class Bicicleta extends Veiculo{
	
	int numMarchas;
	String tipo;
	
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public void listarVerificações() {
		System.out.println( "Bicicleta [numMarchas=" + numMarchas + ", tipo=" + tipo + ", qtdRodas=" + qtdRodas + ", cor=" + cor
				+ ", ano=" + ano + ", aro=" + aro + "]");
	}
	
	public void limpar() {
		System.out.println("Limpando a bicicleta...... \n.......\n......\nA bicicleta esta Limpa");
	}
	
	public void ajustar() {
		System.out.println("Ajustando freios...... \nAjustando guidom.......\nAjustando acento......\nA bicicleta esta ajustada");
	}
	
	public void mudarOleo() {
		System.out.println("trocando oleo de freio da bicicleta...... \n.......\n......\nOleo trocado com sucesso");
	}
	

}
