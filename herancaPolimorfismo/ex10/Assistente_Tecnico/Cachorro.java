import java.util.Scanner;


public class Cachorro extends Animal {

    // método para pedir o usuário quantas vezes seu animalvai fazer um som
    // e fazer o animal andar pela tela
	public String getSom() {
        
        Scanner ler = new Scanner(System.in);
        System.out.println( "Escolha quantas vezes seu cachorro vai latir:\n");
        int Num = ler.nextInt();
       
        System.out.println("\n");
   
        for(int i = 0; i < Num; i++ ){
            System.out.print("([]__[])    ");
        }
        System.out.println("\n");
        for(int i = 0; i < Num; i++ ){
            System.out.print("(= '.' =)   ");
        }
        System.out.println("\n");
        for(int i = 0; i < Num; i++ ){
            System.out.print( " (U___U)    " );
        }
        System.out.println("\n");
        for(int i = 0; i < Num; i++ ){
            System.out.print( "(''')_(''') ");
        }
        System.out.println("\n");
        
        System.out.println("Ele faz:\n");

        for(int i = 0; i < Num; i++ ){
           
            System.out.print(som+" ");
        }
        System.out.println("\n");

		return som;
    }
    
	public void setSom(String som) {
		this.som = som;
	}
}