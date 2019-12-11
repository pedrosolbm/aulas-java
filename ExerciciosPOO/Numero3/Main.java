/* 
Faça um programa para controle de empréstimo de livros, com as classes Emprestimo, Livro e Pessoa.
*/
/*
Programadores: Pedro Sol B. Montes, Guilherme A. Dias
Data: 11/12/2019
*/

//biblioteca necessária para manipular data
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        // Criação do objeto Pessoa
        Pessoa p1 = new Pessoa("Dani boy", 1234567890, "24222212232");
        Pessoa p2 = new Pessoa("Vinicius", 1234456741, "2422342322");

        // Creiação do objeto Livro
        Livro l1 = new Livro("O Hobbit", "J.R.R. Tolkien", "Aventura", 123);

        // Criação do objeto emprestimo, que recebe o cpf e o contato de da pessoa p1 e
        // o isbn de do livro l1
        Emprestimo emp1 = new Emprestimo(LocalDate.of(2019, 12, 11), LocalDate.of(2019, 12, 15), p1.getCpf(),
                p1.getContato(), l1.getISBN());

        // imprime na tela
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(emp1.toString());

    }

}