package app;

/*10. Inclua no exercício anterior a solicitação do ano de 
 nascimento e também da data de hoje. A partir destas 
 informações, apresente a idade atual desta pessoa.
 */import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            Scanner ler = new Scanner(System.in);
            int idade, idade2, anoHoje, mesHoje, diaHoje, ano, mes, dia, valido = 0;
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
                    System.out.println("Você nasceu no dia " + dia + " de " + mês + ("de ") + ano + ("."));
                    valido = 1;
                }
            } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
                if (dia > 30) {
                    System.out.println("Dados incorretos.");
                } else {
                    System.out.println("Você nasceu no dia " + dia + " de " + mês + ("de ") + ano + ("."));
                    valido = 1;
                }
            } else if (mes == 2) {
                if (dia > 28) {
                    System.out.println("Dados incorretos.");
                } else {
                    System.out.println("Você nasceu no dia " + dia + " de " + mês + ("de ") + ano + ("."));
                    valido = 1;
                }
            } else {
                System.out.println("Dados incorretos.");
            }
            if (valido == 1) {
                if ((dia >= 21) && (mes == 3) || (dia <= 20) && (mes == 4)) {
                    signo = "Áries";
                } else if ((dia >= 21) && (mes == 4) || (dia <= 20) && (mes == 5)) {
                    signo = "Touro";
                } else if ((dia >= 21) && (mes == 5) || (dia <= 20) && (mes == 6)) {
                    signo = "Gêmeos";
                } else if ((dia >= 21) && (mes == 6) || (dia <= 21) && (mes == 7)) {
                    signo = "Câncer";
                } else if ((dia >= 22) && (mes == 7) || (dia <= 22) && (mes == 8)) {
                    signo = "Leão";
                } else if ((dia >= 23) && (mes == 8) || (dia <= 22) && (mes == 9)) {
                    signo = "Virgem";
                } else if ((dia >= 23) && (mes == 9) || (dia <= 22) && (mes == 10)) {
                    signo = "Libra";
                } else if ((dia >= 23) && (mes == 10) || (dia <= 21) && (mes == 11)) {
                    signo = "Escorpião";
                } else if ((dia >= 22) && (mes == 11) || (dia <= 21) && (mes == 12)) {
                    signo = "Sagitário";
                } else if ((dia >= 22) && (mes == 12) || (dia <= 20) && (mes == 1)) {
                    signo = "Capricórnio";
                } else if ((dia >= 21) && (mes == 1) || (dia <= 19) && (mes == 2)) {
                    signo = "Aquário";
                } else if ((dia >= 20) && (mes == 2) || (dia <= 20) && (mes == 3)) {
                    signo = "Peixes";
                }
                System.out.println(nome+", seu signo é: " + signo + ".");
            }
        }

    }
}