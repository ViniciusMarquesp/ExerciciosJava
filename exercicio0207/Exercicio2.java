package br.com.generation.exercicio0207;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite o 1� n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		num3 = entrada.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			if(num2 > num3) {
				System.out.println("A ordem crescente �: " + num3 + "," + num2 + "," + num1);
			}
			else if(num3 > num2) {
				System.out.println("A ordem crescente �: " + num2 + "," + num3 + "," + num1);
			}
		}
		else if(num2 > num1 && num2 > num3) {
			if(num1 > num3) {
				System.out.println("A ordem crescente �: " + num3 + "," + num1 + "," + num2);
			}
			else if(num3 > num1) {
				System.out.println("A ordem crescente �: " + num1 + "," + num3 + "," + num2);
			}
		}
		else if(num3 > num2 && num3 > num1) {
			if(num2 > num1) {
				System.out.println("A ordem crescente �: " + num1 + "," + num2 + "," + num3);
			}
			else if(num1 > num2) {
				System.out.println("A ordem crescente �: " + num2 + "," + num1 + "," + num3);
			}
		}

	}
}
