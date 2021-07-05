package br.com.generation.Exercicios0507;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
		int soma = 0;
		int numero;
		
		do {
			System.out.println("Digite um número: ");
			numero = Entrada.nextInt();
			soma += numero;
		} while (numero != 0);
		
		System.out.println("Soma: " + soma);

	}

}
