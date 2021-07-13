package br.com.generation.exercicios1307;

import java.util.*;
public class TestaEstoque {

	public static void main(String[] args) {
		
			Loja prod1 = new Loja("Smart Tv", 5000);
		 	Loja prod2 = new Loja("Lustre", 600);
	        Loja prod3 = new Loja("SmartWatch", 3600);
	        Loja prod4 = new Loja("Lâmpada", 20);
	        Loja prod5 = new Loja("Iphone12", 5750);
	        Loja prod6 = new Loja("Tênis Yeezy Boost 350 V2 Zebra", 6300);
	        Loja prod7 = new Loja("Galaxy 21", 8000); 
	        
	        ArrayList<Loja> produtos = new ArrayList<>();
	        
	        produtos.add(prod1);
	        produtos.add(prod2);
	        produtos.add(prod3);
	        produtos.add(prod4);
	        produtos.add(prod5);
	        produtos.add(prod6);
	        produtos.add(prod7);
	        
	        System.out.println("=============================Compras===========================");
	        for(int i = 0; i < produtos.size(); i++) {
	        	System.out.println(produtos.get(i));
	        }
	        
	        System.out.println("\n==========================Compras Final==============================");
	        produtos.remove(3);
	        for(int i = 0; i < produtos.size(); i++) {
	        	System.out.println(produtos.get(i));
	        }
	}

}
