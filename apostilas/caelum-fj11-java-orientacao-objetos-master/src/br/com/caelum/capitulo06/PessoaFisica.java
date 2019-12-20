package br.com.caelum.capitulo06;

// declarando a classe pessoaFisica
public class PessoaFisica {
	//declaração de variáveis
	private String cpf;

	// gets e sets
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//construtor de classe utilizando cpf
	public PessoaFisica(String cpf) {
		// valida o cpf ao criar o objeto
		if (this.validaCPF(cpf) == true) {
			this.cpf = cpf;
			System.out.println("CPF validado");
		} else {
			System.out.println("CPF invalido");
		}
	}

	public boolean validaCPF(String cpf) { 
		//verifica se o cpf tem 11 numeros
		if (cpf.length() != 11) {
			return false;
		}
		String digitosIniciaisDoCPF = cpf.substring(0, 9);
		return this.calculaDigitosVerificadoresCPF(digitosIniciaisDoCPF).equals(cpf.substring(9, 11));
	}
	
	//metodo para calcular o digito verificador de CPF
	private String calculaDigitosVerificadoresCPF(String digitos) {
		Integer primeiroDigito, segundoDigito;
		int soma = 0, peso = 10;
		for (int i = 0; i < digitos.length(); i++) {
			soma += Integer.parseInt(digitos.substring(i, i + 1)) * peso--;
		}
		if (soma % 11 == 0 | soma % 11 == 1) {
			primeiroDigito = new Integer(0);
		} else {
			primeiroDigito = new Integer(11 - (soma % 11));
		}
		soma = 0;
		peso = 11;
		for (int i = 0; i < digitos.length(); i++) {
			soma += Integer.parseInt(digitos.substring(i, i + 1)) * peso--;
		}
		soma += primeiroDigito.intValue() * 2;
		if (soma % 11 == 0 | soma % 11 == 1) {
			segundoDigito = new Integer(0);
		} else {
			segundoDigito = new Integer(11 - (soma % 11));
		}
		return primeiroDigito.toString() + segundoDigito.toString();
	}
}
