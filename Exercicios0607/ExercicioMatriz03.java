package br.com.generation.Exercicios0607;

import java.util.Random;
import java.util.Scanner;

public class ExercicioMatriz03 {

	public static void main(String[] args) {
        double n1[][] = new double[4][6], n2[][] = new double[4][6];
        double m1[][] = new double [4][6], m2[][] = new double[4][6];
        int l, c;
        
        Scanner leia = new Scanner(System.in);

        for(l = 0; l < 2; l++) {
            for(c = 0; c < 3; c++) {
                    System.out.println("Digite n1: ");
                    n1[l][c] = leia.nextDouble();
                    System.out.println("Digite n2: ");
                    n2[l][c] = leia.nextDouble();

                    m1[l][c] = n1[l][c] + n2[l][c];
                    m2[l][c] = n1[l][c] - n2[l][c];
            }
        }
        for(l = 0; l < 2; l++) {
            for(c = 0; c < 3; c++) {
                System.out.println("Matriz m1: " + m1[l][c]);
                System.out.println("Matriz m2: " + m2[l][c]);
            }
        }
    }
}