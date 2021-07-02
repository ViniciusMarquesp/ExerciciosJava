package br.com.generation.exercicio0207;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, resposta;
		
		System.out.println("Digite um número: ");
		num = entrada.nextInt();
		resposta = num % 2;
		
		if(resposta == 0) {
			System.out.println("Seu número é par:"); 
			System.out.println(Math.sqrt(num));
		}
		else {
			System.out.println("Seu número é ímpar: ");
			System.out.println(Math.pow(num, 2));
		}
		

	}

}
