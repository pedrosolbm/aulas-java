// classe bicicleta herda a classe veiculo
public class Bicicleta extends Veiculo {
	// declarando variaveis propria
	int numMarchas;
	String tipo;

	// gets e sets
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

	// imprime os valores do objeto
	public void listarVerificacoes() {
		System.out.println("Bicicleta [numMarchas=" + numMarchas + ", tipo=" + tipo + ", qtdRodas=" + qtdRodas
				+ ", cor=" + cor + ", ano=" + ano + ", aro=" + aro + "]");
	}
	// metodo de lavangem do veículo

	public void limpar() {
		System.out.println("Limpando a bicicleta...... \n.......\n......\nA bicicleta esta Limpa");
	}
	// metodo de ajudar o veículo

	public void ajustar() {
		System.out.println(
				"Ajustando freios...... \nAjustando guidom.......\nAjustando acento......\nA bicicleta esta ajustada");
	}
	// metodo para mudar o oleo

	public void mudarOleo() {
		System.out.println("trocando oleo de freio da bicicleta...... \n.......\n......\nOleo trocado com sucesso");
	}

}
