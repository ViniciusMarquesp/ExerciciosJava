package br.com.generation.Exercicios0507;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, quantos = 0, total = 0;
		
		while(true) {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			
			if(numero == 0) {
				break;
			}
			if(numero % 3 == 0) {
				quantos++;
				total+= numero;
			}
		}
		System.out.println("Média: " + (total / quantos));
	}

}
