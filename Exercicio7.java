/* 
Escreva um método que recebe um array de números e devolve a posição onde se
encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira
ocorrência. 
*/
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data: 5/12/2019
 */

/**
 * Exercicio7
 */
public class Exercicio7 {

    public static void main(String[] args) {
        
        // Chamada do metodo maiorValor
        maiorValor();
    }


    //Metodo que vai receber
    public static void maiorValor() {
        // declaração de variaveis
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[10];
        int numero = 0;

        // contador para inserir os 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero:");
            vetor[i] = ler.nextInt();
        }
        

        // fecha a função scanner, pois não são mais inseridas informações do usuario
        ler.close();
    }

}