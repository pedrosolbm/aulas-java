
/* 
8. Crie uma classe chamada Ingresso que possui um valor em reais e um método imprimeValor().
crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que
retorne o valor do ingresso VIP (com o adicional incluído).
crie uma classe Normal, que herda Ingresso e possui um método que imprime: "Ingresso
Normal".
crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para acessar
e imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui valor
adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as classes
herdam a classe VIP.
*/
/*
 * Programadores: Pedro Sol B. Montes, Guilherme A. Dias 
 * Data:11/12/2019
 */
public class Main {

	public static void main(String[] args) {

		Ingresso ingresso = new Ingresso();
		Normal normal = new Normal();
		VIP vip = new VIP();
		CamaroteInferior ci = new CamaroteInferior();
		CamaroteSuperior cs = new CamaroteSuperior();

		ingresso.setValor(120.00);

		normal.setValor(120.00);
		normal.imprimeIngressoNormal();
		System.out.println();

		vip.setAdicionalVip(40);
		vip.imprimeIngressoVip(normal.getValor());

		ci.setLocalizacao("O camarote Inferior fica no segundo andar sala 3b");
		ci.imprimeLocalizacao();
		System.out.println();

		cs.setMasterVip(50);
		cs.imprimeMasterVip(vip.getAdicionalVip());

	}
}
