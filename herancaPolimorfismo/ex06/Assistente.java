//classe assistente  herda a classe funcionario
public class Assistente extends Funcionario {

	// gets e sets
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		super.salario = salario;
	}

	// metodo para impressao dos valores de atributos do objeto
	@Override
	public String toString() {
		return "Assistente [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}

}
