/* 
 * 2. Faça um programa de agenda telefônica, com as classes Agenda e Contato. 
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */


import java.util.Scanner;// importando a biblioteca Scanner para ler informações do usuario via teclado
                        //  Scanner ler = new Scanner(System.in);

public class Numero2 {
    public static void main(String[] args) {

        // Criação de um novo objeto
        Agenda novoContato = new Agenda("Michael Douglas ","24 99227-7777 ","eusoualenda@live.com");

        //Mostra na tela as informações do Contato contidas na Agenda
        System.out.println("Sua Agenda:\n");
        System.out.println("Nome: " + novoContato.nome);
        System.out.println("Numero: " + novoContato.telefone);
        System.out.println("Email: " + novoContato.email);

    }

    // Declarando a classe Contato
    static class Contato{
        public String nome;//declara variavel
        public String telefone;//declara variavel
        public String email;//declara variavel

        //inicializa um constructor para a classe contato
        public Contato(String _nome, String _telefone, String _email){

            // Atribui as informações para as respectivas variaveis
            this.nome = _nome;
            this.telefone = _telefone;
            this.email = _email;
        }
    }

    // Declarando a classe Contato e fazendo ela herdar atributos de Contato
    static class Agenda extends Contato{
        //inicializa um constructor para a classe agenda
        public Agenda(String _nome, String _telefone, String _email){
            super(_nome, _telefone, _email);
         }
    }
}
