package br.com.generation.Exercicios0507;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numero = 1000;
		
		for(numero = 1000; numero <= 1999; numero++) {
			if(numero % 11 == 5) {
				System.out.println(numero);
			}
		}
	}

}
