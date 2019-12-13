// classe AssistenteTecnico herda a classe assistente
public class AssistenteTecnico extends Assistente {
	
	//declarando varaiveis 
	double bonusSalarial;
	
	//gets e sets
	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}
	// metodo para imprimir os valores do objeto
	@Override
	public String toString() {
		return "AssistenteTecnico [bonusSalarial=" + bonusSalarial + ", matricula=" + matricula + ", nome=" + nome
				+ ", salario=" + salario + "]";
	}



}
