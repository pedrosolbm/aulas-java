/* 
 * 1. Identifique as classes e implemente um programa para a seguinte especificação:
“O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma
quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item especifica
o produto que o cliente deseja e a respectiva quantidade.Esse pedido pode ser pago em dinheiro,
cheque ou cartão.”
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */

import java.util.Scanner;;//importando a classe scanner para pegar informações do usuário

public class Numero1 {
    public static void main(String[] args) {

        //Declara o scanner para ser utilizado na leitura de informação do teclado
        Scanner ler = new Scanner(System.in);

        //começa a executar o codigo verificando se haverá erros
        try {

            // Criação de um novo objeto e atribui os parametros
            Produto feijão = new Produto();
            feijão.novoPreco(5.50);
            feijão.novaQuantidade(10);
            feijão.nome = "Feijão Preto";

            // Criação de um novo objeto e atribui os parametros
            Produto arroz = new Produto();
            arroz.novoPreco(6.0);
            arroz.novaQuantidade(10);
            arroz.nome = "Arroz Branco";

            // Criação de um novo objeto e atribui os parametros
            Produto macarrao = new Produto();
            macarrao.novoPreco(3.80);
            macarrao.novaQuantidade(12);
            macarrao.nome = "Macarrão Espaguete";

            // Criação de um novo objeto e atribui os parametros
            Produto refrigerante = new Produto();
            refrigerante.novoPreco(2.50);
            refrigerante.novaQuantidade(30);
            refrigerante.nome = "Coca-Cola";

            // Criação de um novo objeto e atribui os parametros
            Produto biscoito = new Produto();
            biscoito.novoPreco(10.00);
            biscoito.novaQuantidade(8);
            biscoito.nome = "Biscoito de Ovinho";

            //as linhas a seguir pedem para o usuario uma informação e armazena elas
            System.out.println("Escolha um produto :\n");
            System.out.println(
                    "1." + (feijão.nome) + " R$ " + (feijão.preco) + "\n2." + (arroz.nome) + " R$ " + (arroz.preco)
                            + "\n3." + (macarrao.nome) + " R$ " + (macarrao.preco) + "\n4." + (refrigerante.nome)
                            + " R$ " + (refrigerante.preco) + "\n5." + (biscoito.nome) + " R$ " + (biscoito.preco));
            int Num = ler.nextInt();
            // as linhas a seguir pedem para o usuario uma informação e armazena elas
            System.out.println("Escolha a quantidade :");
            int quantidade = ler.nextInt();
            // as linhas a seguir pedem para o usuario uma informação e armazena elas
            System.out.println("Agora a forma de pagamento :\n 1. Dinheiro \n 2. Cartão \n 3. Cheque");
            int Pedido = ler.nextInt();

             // Inicia um switch conforme a escolha do usuário 
            switch (Pedido) {
            case 1:
                System.out.println("Sua compra no Dinheiro foi :");
                break;
            case 2:
                System.out.println("Sua compra no Cartão foi :");
                break;
            case 3:
                System.out.println("Sua compra no Cheque foi :");
                break;

            default:
                System.out.println("NDA");
                break;
            }

             // Inicia um switch conforme a escolha do usuário 
            switch (Num) {
            case 1:
                int novoEstoque = (feijão.quantidade) - quantidade;
                feijão.quantidade = feijão.quantidade - novoEstoque;

                if (novoEstoque < (feijão.quantidade)) {
                    System.out.println("Não ha quantidade disponivel em nosso estoque");
                } else {
                    System.out.println((quantidade) + " " + (feijão.nome) + " R$ " + (feijão.preco) * quantidade);
                    System.out.println("Quantidade no estoque e: " + novoEstoque);
                }
                break;

            case 2:
                int novoEstoque2 = (arroz.quantidade) - quantidade;
                arroz.quantidade = arroz.quantidade - novoEstoque2;

                if (novoEstoque2 < (arroz.quantidade)) {
                    System.out.println("Não ha quantidade disponivel em nosso estoque");
                } else {
                    System.out.println((quantidade) + " " + (arroz.nome) + " R$ " + (arroz.preco) * quantidade);
                    System.out.println("Quantidade no estoque e: " + novoEstoque2);
                }
                break;

            case 3:
                int novoEstoque3 = (macarrao.quantidade) - quantidade;
                macarrao.quantidade = macarrao.quantidade - novoEstoque3;

                if (novoEstoque3 < (macarrao.quantidade)) {
                    System.out.println("Não ha quantidade disponivel em nosso estoque");
                } else {
                    System.out.println((quantidade) + " " + (macarrao.nome) + " R$ " + (macarrao.preco) * quantidade);
                    System.out.println("Quantidade no estoque e: " + novoEstoque3);
                }
                break;

            case 4:
                int novoEstoque4 = (refrigerante.quantidade) - quantidade;
                refrigerante.quantidade = refrigerante.quantidade - novoEstoque4;

                if (novoEstoque4 < (refrigerante.quantidade)) {
                    System.out.println("Não ha quantidade disponivel em nosso estoque");
                } else {
                    System.out.println(
                            (quantidade) + " " + (refrigerante.nome) + " R$ " + (refrigerante.preco) * quantidade);
                    System.out.println("Quantidade no estoque e: " + novoEstoque4);
                }
                break;

            case 5:
                int novoEstoque5 = (biscoito.quantidade) - quantidade;
                biscoito.quantidade = biscoito.quantidade - novoEstoque5;

                if (novoEstoque5 < (biscoito.quantidade)) {
                    System.out.println("Não ha quantidade disponivel em nosso estoque");
                } else {
                    System.out.println(
                            (quantidade) + " " + (biscoito.nome) + " R$ " + (biscoito.preco) * quantidade + "\n");
                    System.out.println("Quantidade no estoque e: " + novoEstoque5);
                }
                break;
            default:
                System.out.println("NDA\n");// casa nada funcione
                break;
            }

        } 
        //se houver erro, vai informar a mensagem abaixo para o usuario
        catch (Exception e) {
            System.out.println("Valores informados não são válidos, por fovor entre novamente.");
        }

    }

    static class Produto {
         //declara as variaveis
        String nome;
        double preco;
        int quantidade;

        //método para pegar os parametros e armazenar o valor 
        void novoPreco(double valor) {
            preco = valor;
        }

         //método para pegar os parametros e armazenar a quantidade 
        void novaQuantidade(int qnt) {
            quantidade = qnt;
        }

    }

    static class Pedido {
         //declara as variaveis
        double produto;
        int quantidadeProduto;
        int pagamento;
    }

}