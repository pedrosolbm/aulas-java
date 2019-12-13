
//classe ContaCorrenteEspecial herda os métodos e atributos de ContaCorrente
public class ContaCorrenteEspecial extends ContaCorrente {

	// construtor de contaCorrenteEspecial utilizando atributos herdados
	public ContaCorrenteEspecial(int numConta, long cpf, String cliente, double saldo) {
		super(numConta, cpf, cliente, saldo);

	}

	// metodo próprio de saque da contaCorrenteEspecial
	public double sacar(double valor) {

		// se tentar sacar quantidade maior que o saldo disponível
		if ((valor + valor * 0.001) > saldo) {
			// mensagem de erro
			System.out.println("Valor superior ao saldo disponivel");
		} else {
			// saldo = saldo - valor do saque
			saldo = saldo - (valor + valor * 0.005);
		}
		// retorna o saldo atualizado após o saque
		return saldo;

	}

}
