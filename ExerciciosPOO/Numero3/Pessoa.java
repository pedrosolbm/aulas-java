//Classe pessoa
public class Pessoa {

    //declarando variáveis
    private String nome;
    private int cpf;
    private String contato;

    //Construtor cheio
    public Pessoa(String nome, int cpf,String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato=contato;
    }

    //metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    //retorna os valroes de Pessoa como uma String
    @Override
    public String toString() {
        return "Pessoa : Contato=" + contato + ", cpf=" + cpf + ", nome=" + nome + "";
    }
    
}

