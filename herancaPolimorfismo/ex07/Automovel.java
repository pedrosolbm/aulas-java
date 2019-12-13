//classe automovel herda a classe veículo
public class Automovel extends Veiculo{
	
	//declarando variaveis
	int cavalos;
	int numPortas;
	String tipo;
	
	//gets e sets
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	// imprime os valores do objeto
	public void listarVerificacoes() {
		System.out.println( "Automovel [cavalos=" + cavalos + ", numPortas=" + numPortas + ", tipo=" + tipo + ", qtdRodas="
				+ qtdRodas + ", cor=" + cor + ", ano=" + ano + ", aro=" + aro + "]");
	}
	
	//metodo de lavangem do veículo
	public void limpar() {
		System.out.println("Lavando o veiculo...... \nLavando o veiculo.......\nLavando o veiculo......\nO veiculo esta Limpo");
	}
	//metodo de ajudar o veículo
	public void ajustar() {
		System.out.println("Ajustando espelhos.......\nAjustando acento......\nA veiculo ajustado com sucesso");
	}
	
	//metodo para mudar o oleo
	public void mudarOleo() {
		System.out.println("Trocando oleo do veiculo...... \nTrocando oleo do veiculo.......\nTrocando oleo do veiculo......\nOleo trocado com sucesso");
	}
	
	
	

}
