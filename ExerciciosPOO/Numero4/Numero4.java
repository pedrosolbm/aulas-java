/* 
 * 4. Construa um programa com as seguintes características:
     Implemente uma classe Proprietário. Declare os seguintes atributos na classe:
         Nome, CPF, RG, Data de Nascimento, Rua, Bairro, Cidade, Estado, Cep, Complemento
     Implemente uma classe Carro. Declare os seguintes atributos na classe:
         Modelo, Cor, Ano, Marca, Chassi, Proprietário, Velocidade máxima, Velocidade atual, Nr de
            portas, tem teto solar?, Nr Marchas, tem cambio automatico?, Volume de combustível
     Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h
     Implemente o método freia que para o carro – Velocidade = 0 km/h
     Implemete o método troca marcha
     Implemente o método reduz a marcha;
     Altere a classe Proprietário para que o atributo Endereço vire uma classe
     A marcha ré nao pode ser engatada se o a velocidade for superior a 0 KM/h;
     Implemente um método que calcule a autonomia de viagem do veículo com base no consumo
        médio passado como parâmetro;
     Implemente um método para exibir o volume de combustível
     Transforme o atributo Marca de um carro em uma classe Marca com nome, nrDeModelos,
        ano de lançamento e código identificador
     Instancie um objeto da classe Carro, Pessoa, Endereço, Marca e relacione os objetos utilizando
        os métodos ou construtores quando necessário.
 */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */

import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Numero4 {
    public static void main(String[] args) {
        // importando a biblioteca Scanner para ler informações do usuario via teclado
        Scanner ler = new Scanner(System.in);

        //começa a executar o codigo verificando se haverá erros
        try {
            // Da opçoes de escolha para o usuario
            System.out.println("Selecione 1 , 2 , 3 ou 4");
            int escolha = ler.nextInt();//pega  a informação

        // Inicia um switch conforme a escolha do usuário 
        switch (escolha) {
            case 1:
                // Criação de um novo objeto
                Proprietario novoProprietario = new Proprietario();

                // as linhas a seguir pedem para o usuario uma informação e armazena elas
                System.out.println("Informe seu nome:");
                String nome = ler.nextLine();
                System.out.println("Informe seu CPF:");
                long cpf = ler.nextLong();

                //chama a função
                novoProprietario.mostraInfo(nome, cpf);
            break;

            case 2:
                Scanner end = new Scanner(System.in);

                // Criação de um novo objeto
                Endereco novoEndereco = new Endereco();

                 // as linhas a seguir pedem para o usuario uma informação e armazena elas
                System.out.println("Informe sua Rua:");
                String Rua = end.nextLine();
                System.out.println("Informe seu Bairro:");
                String bairro = end.nextLine();
                System.out.println("Informe sua Cidade:");
                String cidade = end.nextLine();
                System.out.println("Informe um Complemento:");
                String complemento = end.nextLine();
                System.out.println("Informe seu CEP:");
                int cep = end.nextInt();
        
                //chama a função e passa as parametros
                novoEndereco.lougradouro(Rua,bairro,cidade,complemento,cep);
                //chama a função
                novoEndereco.mostraLougradouro();
            break;

            case 3:
                // Criação de um novo objeto
                Carro Fiat = new Carro();

                // as linhas a seguir pedem para o usuario uma informação e armazena elas
                System.out.println("Informe a distancia:");
                double distancia = ler.nextDouble();
                System.out.println("Agora a quantidade de litros:");
                double litros = ler.nextDouble();
        
                //chama a função e passa as parametros
                Fiat.autoViagem(distancia, litros);
                //chama a função
                Fiat.acelera();
                //chama a função e passa as parametros
                Fiat.trocaMarcha(6);
            break;

            case 4:
            Scanner marca = new Scanner(System.in);

            // Criação de um novo objeto
            Marca novaMarca = new Marca();

            //as linhas a seguir pedem para o usuario uma informação e armazena elas
            System.out.println("Informe a marca:");
            String nomeMarca = marca.nextLine();
            System.out.println("Informe o numero do modelo :");
            double modelo = marca.nextDouble();
            System.out.println("Informe o ano de lancamento:");
            int ano = marca.nextInt();
            System.out.println("Informe um codigo:");
            int codigo = marca.nextInt();
    
            //chama a função e passa as parametros
            novaMarca.registro(nomeMarca, modelo, ano, codigo);
            //chama a função
            novaMarca.mostraMarca();
            break;
        
            default:
            System.out.println("NDA");// casa nada funcione
            break;
        }
    
        } 
        //se houver erro, vai informar a mensagem abaixo para o usuario
        catch (Exception e) {
            System.out.println("Opcao nao valida:");
        }

    }


    static class Proprietario {
        //declara as variaveis
        String nome;
        long cpf;
        int Rg;
        int dataNascimento;

        // método a seguir para pegar os parametros mostrar as informações
        void mostraInfo(String nome, long cpf) {
            System.out.println("Suas Informações :\n" + nome + "\n" + cpf);
        }
    }

    static class Endereco {
        //declara as variaveis
        String Rua;
        String Bairro;
        String Cidade;
        String Complemento;
        int CEP;

        // método para pegar parametros e atribui-los/armazena-los as variaveis
        void lougradouro(String R,String B,String C,String Com,int cep ) {
            Rua = R;
            Bairro = B;
            Cidade = C;
            Complemento = Com;
            CEP = cep;
           
        }
        // método para mostrar o mostar o Lougradouro
        void mostraLougradouro() {
            System.out.println("Suas Informacoes : "+ Rua+", "+Bairro+", "+Cidade+", "+Complemento+", "+CEP);
        }
    }

    static class Carro {
        //declara as variaveis
        String modelo;
        String Cor;
        int Ano;
        long Chassi;
        String Proprietario;
        int velMax = 120;
        int velAtual;
        int numPortas;
        int numMarchas;
        boolean tetoSolar;
        boolean cambioAuto;
        float volCombustivel;

        // método para a acelerão
        void acelera() {

            for (int i = 0; i < velMax; i++) {
                velAtual = velMax + 1;
            }
        }
        
        // método para freiar 
        void freia() {
            velAtual = 0;
        }

        // método para trocar marcha
        void trocaMarcha(int troca) {

            if (troca == 6 && velAtual > 0) {
                System.out.println("Diminua a velocidade primeiro");
            } else {
                numMarchas = troca;
            }
        }

        // método para reduzir marcha
        void reduzMarcha() {
            for (int i = 0; i < 6; i--) {
                numMarchas = numMarchas - 1;
            }
        }


        // método para pegar pararmetros e calcular a autonomia do veiculo
        void autoViagem(double distancia, double litros) {
            double autonomia = (distancia) / (litros);
            System.out.println("Seu carro faz: " + autonomia + "km por litro");
        }

    }

    static class Marca {
        //declara as variaveis
        String nome;
        double numModelos;
        int anoLancamento;
        int codigo;

        // método para pegar parametros e fazer o registro de uma marca
        void registro(String N, double numM,int anoL,int cod ) {
            nome = N;
            numModelos = numM;
            anoLancamento = anoL;
            codigo = cod;
        }


        // método para mostrar a marca
        void mostraMarca() {
            System.out.println("Informacoes : "+nome+", "+numModelos+", "+anoLancamento+", "+codigo);
        }
    }

}