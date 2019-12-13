// Classe conta corrente

public class ContaCorrente {

	// declaração de variáveis
	int numConta;
	long cpf;
	String cliente;
	double saldo;

	// construtor de classe cheio, recebe todos os atributos
	public ContaCorrente(int numConta, long cpf, String cliente, double saldo) {
		super();
		this.numConta = numConta;
		this.cpf = cpf;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	// gets e sets
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// metodo para depósito
	public double depositar(double valor) {

		// o saldo do objeto recebe o saldo + valor passado no método
		this.saldo = saldo + valor;

		// retorna o saldo após o deposito
		return saldo;
	}

	// metodo de saque
	public double sacar(double valor) {

		// se tentar sacar quantidade maior que o saldo disponível
		if ((valor + valor * 0.005) > saldo) {
			// mensagem de erro
			System.out.println("Valor superior ao saldo dispon�vel");
		}
		// caso consiga consigar sacar
		else {
			// saldo = saldo - valor do saque
			saldo = saldo - (valor + valor * 0.005);
		}

		// retorna o saldo atualizado após o saque
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numConta=" + numConta + ", cpf=" + cpf + ", cliente=" + cliente + ", saldo=" + saldo
				+ "]";
	}

}
