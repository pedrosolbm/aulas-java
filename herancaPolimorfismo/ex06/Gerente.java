// classe gerente herda classe funcionario
public class Gerente extends Funcionario {

	//declarando variavel prorpia
	String cargo;
	
	//gets e sets
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
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
		return "Gerente [cargo=" + cargo + ", matricula=" + matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}

	
	
	
}
