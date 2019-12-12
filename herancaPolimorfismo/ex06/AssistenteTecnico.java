package br.com.residencia.bin.ex06;

public class AssistenteTecnico extends Assistente {

	double bonusSalarial;
	
	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

	@Override
	public String toString() {
		return "AssistenteTecnico [bonusSalarial=" + bonusSalarial + ", matricula=" + matricula + ", nome=" + nome
				+ ", salario=" + salario + "]";
	}



}
