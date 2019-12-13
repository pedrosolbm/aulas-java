// classe funcionario
public class Funcionario {

	//declarando variaveis prorias
	int matricula;
	String nome;
	double salario;

	//gets e sets 
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
		this.salario = salario;
	}

	// metodo para imprimir os valores do objeto
	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
}
