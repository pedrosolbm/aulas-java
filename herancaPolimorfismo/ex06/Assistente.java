public class Assistente extends Funcionario{

	
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
	@Override
	public String toString() {
		return "Assistente [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
