// classe abstrata veiculo
public abstract class Veiculo {

	//declarando variaveis
	int qtdRodas;
	String cor;
	int ano;
	int aro;
	
	//gets e sets
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

	//metodos abstratos
	abstract void listarVerificacoes();
	
	abstract void limpar();
	
	abstract void ajustar();
	
	abstract void mudarOleo();
	
}
