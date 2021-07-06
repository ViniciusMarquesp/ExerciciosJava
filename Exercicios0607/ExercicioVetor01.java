package br.com.generation.Exercicios0607;

import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double[] pontuacao = new double[5];
		double maiorNumero = 0.0;
		
		System.out.println("Digite 5 valores da pontuação da atividade: ");
		for(int l = 0; l < pontuacao.length; l++) {
			pontuacao[l] = read.nextDouble();
			if(pontuacao[l] > maiorNumero) {
				maiorNumero = pontuacao[l];
			}
			
		}
		for(int l = 0; l < pontuacao.length; l++) {
			System.out.print(pontuacao[l] + ", ");
		}
		System.out.println("\nO maior número foi de: " + maiorNumero);

	}

}
