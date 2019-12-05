//Para cada conjunto de valores abaixo, escreva o código Java, usando laço(s),
//que preencha um array com os valores: c) 1 2 3 4 5 10 20 30 40 50

/**
 * Programadores: Pedro Sol B Montes, Guilherme A. Dias
 * Data: 5/12/2019
 */
public class Exercicio1c {
    public static void main(String[] args) {

        // declaração do vetor do tipo int com 10 posições (0 até 9)
        int vetor[] = new int[10];

        //contador que vai de 0 até a ultima posição do vetor
        for (int i = 0; i < vetor.length; i++) {

            // para cada repetição, a posição do vetor recebe o numero do contador + 1
            vetor[i] = i + 1;

            // a partir de 5, o contador multiplica o resultado pelos primeiros numeros
            if (i >= 5) {
                vetor[i] = 10*((i-5)+1);
            }

            //Exibe os valores do vetor
            System.out.print(vetor[i]+" ");
        }

    }
}