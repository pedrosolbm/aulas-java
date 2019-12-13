//classe assistente adminstrativo herda a classe assistente
public class AssistenteAdministrativo extends Assistente {

	// declarando variaveis
	double adicionalNoturno;
	String turno;

	// gets e sets
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	// metodo de impressao dos valores do objeto
	@Override
	public String toString() {
		return "AssistenteAdministrativo [adicionalNoturno=" + adicionalNoturno + ", turno=" + turno + ", matricula="
				+ matricula + ", nome=" + nome + ", salario=" + salario + "]";
	}

}