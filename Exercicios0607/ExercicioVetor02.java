package br.com.generation.Exercicios0607;

import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite 10 valores: ");
				
        int lancamentos[] = new int[10], maiorOcorrencia = 0;
        double soma = 0.0, media = 0.0, maiorPontuacao = 0.0;
        int i;

        for(i = 0; i < lancamentos.length; i++) {
            lancamentos[i] = read.nextInt(); 
            soma += lancamentos[i];
            if(lancamentos[i] > maiorPontuacao) { 
                maiorPontuacao = lancamentos[i]; 
                maiorOcorrencia = 0;
            }
            if(lancamentos[i] == maiorPontuacao) {
                maiorOcorrencia++;
            }
        }
        
        System.out.print("O vetor gerado é: | ");
        for(i = 0; i < lancamentos.length; i++) {
            System.out.print(lancamentos[i] + " | ");
        }

        media = soma/lancamentos.length;
        System.out.println("\nA média aritmética dos lançamentos é de: " + media);
        System.out.println("A maior ocorrência de maior número dos lançamentos é de: " + maiorOcorrencia);

	}

}
