package br.com.generation.exercicio0207;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva sua idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <=14) {
			System.out.println("Categoria infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria Adulto");
		}
		else {
			System.out.println("Categoria inv?lida");
		}
		

	}

}
