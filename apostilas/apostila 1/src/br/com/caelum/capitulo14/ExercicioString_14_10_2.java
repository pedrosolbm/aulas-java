package br.com.caelum.capitulo14;

public class ExercicioString_14_10_2 {

	public static void main(String[] args) {
		//Declarando Strings
		String s1 = "Curso de JAVA";
		String s2 = "JAVA";
		//Verifica se uma String se encontra dentro de outra
		System.out.println(s1.contains(s2));
		
		String s3 = "JAVA ";
		//Tira espaço em branco das pontas de uma String
		System.out.println(s3.trim());
		
		String s4 = "";
		//Saber se uma String esta vazia
		System.out.println(s4.isEmpty());
		//Saber quantos caracteres tem uma String
		System.out.println(s1.length());
	}

}
