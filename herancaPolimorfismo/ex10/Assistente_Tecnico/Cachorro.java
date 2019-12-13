import java.util.Scanner;


public class Cachorro extends Animal {

    
	public String getSom() {
        
        Scanner ler = new Scanner(System.in);
        System.out.println( "Escolha quantas vezes seu cachorro vai latir:\n");
        int Num = ler.nextInt();
        System.out.println("Ele faz:\n");

        for(int i = 0; i < Num; i++ ){
            System.out.print(som+" ");       
        }
		return som;
    }
    
	public void setSom(String som) {
		this.som = som;
	}
}