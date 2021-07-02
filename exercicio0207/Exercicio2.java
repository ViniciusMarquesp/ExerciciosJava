package br.com.generation.exercicio0207;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite o 1º número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		num3 = entrada.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			if(num2 > num3) {
				System.out.println("A ordem crescente é: " + num3 + "," + num2 + "," + num1);
			}
			else if(num3 > num2) {
				System.out.println("A ordem crescente é: " + num2 + "," + num3 + "," + num1);
			}
		}
		else if(num2 > num1 && num2 > num3) {
			if(num1 > num3) {
				System.out.println("A ordem crescente é: " + num3 + "," + num1 + "," + num2);
			}
			else if(num3 > num1) {
				System.out.println("A ordem crescente é: " + num1 + "," + num3 + "," + num2);
			}
		}
		else if(num3 > num2 && num3 > num1) {
			if(num2 > num1) {
				System.out.println("A ordem crescente é: " + num1 + "," + num2 + "," + num3);
			}
			else if(num1 > num2) {
				System.out.println("A ordem crescente é: " + num2 + "," + num1 + "," + num3);
			}
		}

	}
}
