public abstract class Veiculo {

	
	int qtdRodas;
	String cor;
	int ano;
	int aro;
	
	
	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	abstract void listarVerifica��es();
	
	abstract void limpar();
	
	abstract void ajustar();
	
	abstract void mudarOleo();
	
}
