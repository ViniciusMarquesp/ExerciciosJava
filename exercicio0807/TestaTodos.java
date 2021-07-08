package br.com.generation.exercicio0807;

public class TestaTodos {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguiça preguica = new Preguiça();
		
		dog.setNome("Marley");
		dog.setIdade(3);
		dog.setCor("Preto");
		dog.setPelo("Sim");
		dog.setSom("Latido");
		dog.setDeveCorrer("Sim");
		
		horse.setNome("Alasão");
		horse.setIdade(4);
		horse.setCor("Marrom");
		horse.setPelo("Sim");
		horse.setSom("Relincho");
		horse.setDeveCorrer("Sim");
		
		preguica.setNome("Sid");
		preguica.setIdade(20);
		preguica.setCor("Marrom");
		preguica.setPelo("Sim");
		preguica.setSom("Sons de alta-frequência pelas narinas");
		preguica.setSubirArvore("Sim");
		
		System.out.println("=====Dados Cachorro=====");
		System.out.println("\nNome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade() + " Anos");
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Som: " + dog.getSom());
		System.out.println("Corre: " + dog.getDeveCorrer());
		
		System.out.println("\n=====Dados Cavalo=====");
		System.out.println("\nNome: " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade() + " Anos");
		System.out.println("Cor: " + horse.getCor());
		System.out.println("Som: " + horse.getSom());
		System.out.println("Corre: " + horse.getDeveCorrer());
		
		System.out.println("=====Dados Preguiça=====");
		System.out.println("\nNome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade() + " Anos");
		System.out.println("Cor: " + preguica.getCor());
		System.out.println("Som: " + preguica.getSom());
		System.out.println("Escala Árvores: " + preguica.getSubirArvore());

	}

}
