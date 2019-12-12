public class ContaCorrenteEspecial extends ContaCorrente{

	public ContaCorrenteEspecial(int numConta, long cpf, String cliente, double saldo) {
		super(numConta, cpf, cliente, saldo);
			
	}
	
	public double sacar(double valor) {
		
		if((valor+valor*0.001)>saldo) {
			System.out.println("Valor superior ao saldo dispon�vel");
		}else {
			saldo= saldo-(valor+valor*0.005);
		}
				
		return saldo;

	}

}
