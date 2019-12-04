package app;
import java.util.Scanner;//importando a classe scanner para pegar informações do usuário

public class Exercicio14{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);

    try {//começa a executar o codigo verificando se haverá erros

        System.out.println("Informe o dia");//exibe a mensagem na tela e recebe a informação do dia 
        double dia = ler.nextDouble();
        System.out.println("Informe o mes");//exibe a mensagem na tela e recebe a informação do mês
        double mes = ler.nextDouble();

                //----------Os códigos realizam a lógica para definir o mês--------------//

    if (dia <32 && mes == 1){
        System.out.println("O mes e Janeiro");//exibe a mensagem na tela
        }
    else if (dia <29 && mes == 2){
        System.out.println("O mes e Fevereiro");//exibe a mensagem na tela
    }
    else if (dia <31 && mes == 3){
        System.out.println("O mes e Março");//exibe a mensagem na tela
    }
    else if (dia <31 && mes == 4){
        System.out.println("O mes e Abril");//exibe a mensagem na tela
    }
    else if (dia <32 && mes == 5){
        System.out.println("O mes e Maio");//exibe a mensagem na tela
    }
    else if (dia <31 && mes == 6){
        System.out.println("O mes e Junho");//exibe a mensagem na tela
    }
    else if (dia <32 && mes == 7){
        System.out.println("O mes e Julho");//exibe a mensagem na tela
    }
    else if (dia <32 && mes == 8){
        System.out.println("O mes e Agosto");//exibe a mensagem na tela
    }
    else if (dia <31 && mes == 9){
        System.out.println("O mes e Setembro");//exibe a mensagem na tela
    }
    else if (dia <32 && mes == 10){
        System.out.println("O mes e Outubro");//exibe a mensagem na tela
    }
    else if (dia <31 && mes == 11){
        System.out.println("O mes e Novembro");//exibe a mensagem na tela
    }
    else if (dia <32 && mes == 12){
        System.out.println("O mes e Dezembro");//exibe a mensagem na tela
    }
    else if (dia <= 0 || mes <= 0){
        System.out.println("Verifique sua data!");//exibe a mensagem na tela

    }
    else {
        System.out.println("Erro de digitação, entre novamente com os valores");//exibe a mensagem na tela

    } 

          //----------Os códigos realizam a lógica para definir qual é o signo--------------//
    
    String signo="";

    if((dia >= 21)&&(mes == 3)||(dia <=20)&&(mes == 4)){
        signo = "Aries";
    }
    else if((dia>=21)&&(mes ==4)||(dia<=20)&&(mes==5)){
        signo = "Touro";
    }
    else if((dia>=21)&&(mes ==5)||(dia<=20)&&(mes==6)){
        signo = "Gemeos";
    }
    else if((dia>=21)&&(mes ==6)||(dia<=21)&&(mes==7)){
        signo = "Cancer";
    }
    else if((dia>=22)&&(mes ==7)||(dia<=22)&&(mes==8)){
        signo = "Leao";
    }
    else if((dia>=23)&&(mes ==8)||(dia<=22)&&(mes==9)){
        signo = "Virgem";
    }
    else if((dia>=23)&&(mes ==9)||(dia<=22)&&(mes==10)){
        signo = "Libra";
    }
    else if((dia>=23)&&(mes ==10)||(dia<=21)&&(mes==11)){
        signo = "Escorpiao";
    }
    else if((dia>=22)&&(mes ==11)||(dia<=21)&&(mes==12)){
        signo = "Sagitario";
    }
    else if((dia>=22)&&(mes ==12)||(dia<=20)&&(mes==1)){
        signo = "Capricornio";
    }
    else if((dia>=21)&&(mes ==1)||(dia<=19)&&(mes==2)){
        signo = "Aquario";
    }
    else if((dia>=20)&&(mes ==2)||(dia<=20)&&(mes==3)){
        signo = "Peixes";
    }
    System.out.println("\nSeu signo e: " + signo);//exibe a mensagem na tela

    ler.close();//para de esperar entrada de dados pelo teclado
        
    } catch (Exception e) {
        //se houver erro, vai informar a mensagem abaixo para o usuario
        System.out.println("Parametro Invalido!");//exibe a mensagem na tela
    }
}
}