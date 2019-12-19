package br.com.caelum.capitulo06;

public class PessoaFisica {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica(String cpf) {
		if (this.validaCPF(cpf) == true) {
			this.cpf = cpf;
			System.out.println("CPF validado");
		} else {
			System.out.println("CPF inválido");
		}
	}
	
	public boolean validaCPF(String cpf) { 
		if (cpf.length() != 11) {
			return false;
		}
		String digitosIniciaisDoCPF = cpf.substring(0, 9);
		return this.calculaDigitosVerificadoresCPF(digitosIniciaisDoCPF).equals(cpf.substring(9, 11));
	}
	
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
