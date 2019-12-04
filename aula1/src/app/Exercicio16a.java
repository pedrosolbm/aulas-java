package app;
import java.util.Scanner;

public class Exercicio16a{
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        for (int i = 10; i <= 200; i++) {

            int cont = 0;

            for (int k = 1; k <= i; k++) {

                if (i % k == 0) ++cont;

            }

            if (cont == 2) {

                System.out.println(i);

            }
        }

} 

}