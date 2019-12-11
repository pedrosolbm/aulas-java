import java.io.DataInput;
import java.util.Scanner;

public class Numero4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Selecione 1 , 2 , 3 ou 4");
        int escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                Proprietario novoProprietario = new Proprietario();
                System.out.println("Informe seu nome:");
                String nome = ler.nextLine();

                System.out.println("Informe seu CPF:");
                long cpf = ler.nextLong();

                novoProprietario.mostraInfo(nome, cpf);
            break;

            case 2:
                Scanner end = new Scanner(System.in);
                Endereco novoEndereco = new Endereco();

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
        
                novoEndereco.lougradouro(Rua,bairro,cidade,complemento,cep);
                novoEndereco.mostraLougradouro();
            break;

            case 3:
                Carro Fiat = new Carro();
                System.out.println("Informe a distancia:");
                double distancia = ler.nextDouble();
                System.out.println("Agora a quantidade de litros:");
                double litros = ler.nextDouble();
        
                Fiat.autoViagem(distancia, litros);

                Fiat.acelera();

                Fiat.trocaMarcha(6);
            break;

            case 4:
            Scanner marca = new Scanner(System.in);
            Marca novaMarca = new Marca();

            System.out.println("Informe a marca:");
            String nomeMarca = marca.nextLine();
    
            System.out.println("Informe o numero do modelo :");
            double modelo = marca.nextDouble();
    
            System.out.println("Informe o ano de lancamento:");
            int ano = marca.nextInt();
    
            System.out.println("Informe um codigo:");
            int codigo = marca.nextInt();
    
            novaMarca.registro(nomeMarca, modelo, ano, codigo);
            novaMarca.mostraMarca();
            break;
        
            default:
            System.out.println("NDA");
            break;
        }
    
        } catch (Exception e) {
            System.out.println("Opcao nao valida:");
        }

    }






    static class Proprietario {
        String nome;
        long cpf;
        int Rg;
        int dataNascimento;

        void mostraInfo(String nome, long cpf) {
            System.out.println("Suas Informações :\n" + nome + "\n" + cpf);
        }
    }

    static class Endereco {
        String Rua;
        String Bairro;
        String Cidade;
        String Complemento;
        int CEP;

        void lougradouro(String R,String B,String C,String Com,int cep ) {
            Rua = R;
            Bairro = B;
            Cidade = C;
            Complemento = Com;
            CEP = cep;
           
        }
        void mostraLougradouro() {
            System.out.println("Suas Informacoes : "+ Rua+", "+Bairro+", "+Cidade+", "+Complemento+", "+CEP);
        }
    }

    static class Carro {
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

        void acelera() {

            for (int i = 0; i < velMax; i++) {
                velAtual = velMax + 1;
            }
        }

        void freia() {
            velAtual = 0;
        }

        void trocaMarcha(int troca) {

            if (troca == 6 && velAtual > 0) {
                System.out.println("Diminua a velocidade primeiro");
            } else {
                numMarchas = troca;
            }
        }

        void reduzMarcha() {
            for (int i = 0; i < 6; i--) {
                numMarchas = numMarchas - 1;
            }
        }

        void autoViagem(double distancia, double litros) {
            double autonomia = (distancia) / (litros);
            System.out.println("Seu carro faz: " + autonomia + "km por litro");
        }

    }

    static class Marca {
        String nome;
        double numModelos;
        int anoLancamento;
        int codigo;

        void registro(String N, double numM,int anoL,int cod ) {
            nome = N;
            numModelos = numM;
            anoLancamento = anoL;
            codigo = cod;
        }

        void mostraMarca() {
            System.out.println("Informacoes : "+nome+", "+numModelos+", "+anoLancamento+", "+codigo);
        }
    }

}