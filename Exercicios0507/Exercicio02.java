package br.com.generation.Exercicios0507;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		int par = 0, impar = 0, num;
		
		for(int cont = 0; cont <10; cont++) {
			System.out.println("Digite um numero inteiro: ");
			num = Entrada.nextInt();
			
			if(num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println(par + " Numeros pares foram digitados.");
		System.out.println(impar + " Numeros ìmpares foram digitados.");

	}
      
}
