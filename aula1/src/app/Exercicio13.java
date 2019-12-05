package app;

/*10. Inclua no exercício anterior a solicitação do ano de 
 nascimento e também da data de hoje. A partir destas 
 informações, apresente a idade atual desta pessoa.
 */
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Scanner ler = new Scanner(System.in);
            int ano, mes, dia, valido = 0;
            String nome;
            String mês = null;
            String signo = null;
            System.out.printf("Diga o seu nome: ");
            nome = ler.nextLine();
            System.out.printf("Diga o dia do seu aniversário: ");
            dia = ler.nextInt();
            System.out.printf("Dia o mês do seu aniversário (1,2,3...): ");
            mes = ler.nextInt();
            System.out.println("Diga o ano que você nasceu:");
            ano = ler.nextInt();
            if (mes == 1) {
                mês = "Janeiro";
            } else if (mes == 2) {
                mês = "Fevereiro";
            } else if (mes == 3) {
                mês = "Março";
            } else if (mes == 4) {
                mês = "Abril";
            } else if (mes == 5) {
                mês = "Maio";
            } else if (mes == 6) {
                mês = "Junho";
            } else if (mes == 7) {
                mês = "Julho";
            } else if (mes == 8) {
                mês = "Agosto";
            } else if (mes == 9) {
                mês = "Setembro";
            } else if (mes == 10) {
                mês = "Outubro";
            } else if (mes == 11) {
                mês = "Novembro";
            } else if (mes == 12) {
                mês = "Dezembro";
            }
            if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
                if (dia > 31) {
                    System.out.println("Dados incorretos.");
                } else {
                    System.out.println(nome+", você nasceu no dia " + dia + " de " + mês + ("de ") + ano + ("."));
                    valido = 1;
                }
            } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
                if (dia > 30) {
                    System.out.println("Dados incorretos.");
                } else {
                    System.out.println(nome+", você nasceu no dia " + dia + " de " + mês + ("de ") + ano + ("."));
                    valido = 1;
                }
            } else if (mes == 2) {
                if (dia > 28) {
                    System.out.println("Dados incorretos.");
                } else {
                    System.out.println(nome+", você nasceu no dia " + dia + " de " + mês + ("de ") + ano + ("."));
                    valido = 1;
                }
            } else {
                System.out.println("Dados incorretos.");
            }
        }

    }
}