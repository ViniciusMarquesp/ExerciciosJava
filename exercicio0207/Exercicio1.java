package br.com.generation.exercicio0207;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o 1� n�mero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		numero3 = entrada.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O numero maior � :" + numero1);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O n�mero maior �: " + numero2);
		}
		else {
			System.out.println("O numero maior �: " + numero3);
		}
			
		
	}

}
