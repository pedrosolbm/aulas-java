//Classe livro
public class Livro {

    //Declaração de variaveis
    private String titulo;
    private String autor;
    private String genero;
    private int ISBN;


    //Construtor cheio
    public Livro(String titulo, String autor, String genero, int iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ISBN = iSBN;
    }


    // metodos get e set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    //Retorna todos os valores do livro como uma String unica
    @Override
    public String toString() {
        return "Livro [ISBN=" + ISBN + ", autor=" + autor + ", genero=" + genero + ", titulo=" + titulo + "]";
    }
}


