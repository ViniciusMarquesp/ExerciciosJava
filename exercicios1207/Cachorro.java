package br.com.generation.exercicios1207;

public class Cachorro implements Animal{

	@Override
	public void nome() {
		System.out.println("Nome: Wilson");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade: 5 anos");
		
	}

	@Override
	public void pelo() {
		System.out.println("Pelo: Sim");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Som: Latido");
		
	}

	@Override
	public void cor() {
		System.out.println("Cor: Preto");
		
	}
	
	public void corre() {
		System.out.println("Cachorro corre");
	}

}
