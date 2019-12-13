/* Crie a classe Imovel, que possui um endereço e um preço.
crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
métodos de acesso e impressão deste valor adicional.
crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie métodos de
acesso e impressão para este desconto. */
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */
public class Main {
	public static void main(String[] args) {

		ImovelNovo in = new ImovelNovo();
		ImovelVelho iv = new ImovelVelho();

		in.setEndereco("Rua dos milion�rios, 777");
		in.setPreco(550300);
		in.setValorAdicional(in.getPreco() * 0.03);
		System.out.println(in.toString());
		in.valorImovelNovo(in.getPreco());

		iv.setEndereco("Rua dos maltrapilhos, 888");
		iv.setPreco(100500);
		iv.setDescontoValor(iv.getPreco() * 0.03);
		System.out.println("\n\n" + iv.toString());
		iv.valorImovelVelho(iv.getPreco());
	}
}
