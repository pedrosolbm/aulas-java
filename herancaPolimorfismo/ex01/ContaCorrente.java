public class ContaCorrente {
	
	int numConta;
	long cpf;
	String cliente;
	double saldo;
	
	
	
	public ContaCorrente(int numConta, long cpf, String cliente, double saldo) {
		super();
		this.numConta = numConta;
		this.cpf = cpf;
		this.cliente = cliente;
		this.saldo = saldo;
	}


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


	public double depositar(double valor) {
		this.saldo= saldo + valor;
		
		return saldo;
	}
	
	public double sacar(double valor) {
		
		if((valor+valor*0.005)>saldo) {
			System.out.println("Valor superior ao saldo dispon�vel");
		}else {
			saldo= saldo-(valor+valor*0.005);
		}
		
		
		return saldo;
	}


	@Override
	public String toString() {
		return "ContaCorrente [numConta=" + numConta + ", cpf=" + cpf + ", cliente=" + cliente + ", saldo=" + saldo
				+ "]";
	}
	
	

}
