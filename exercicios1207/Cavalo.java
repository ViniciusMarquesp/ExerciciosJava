package br.com.generation.exercicios1207;

public class Cavalo implements Animal{


	@Override
	public void nome() {
		System.out.println("Nome: Suecao");		
		
	}

	@Override
	public void idade() {
		System.out.println("Idade: 8 anos");
		
	}

	@Override
	public void pelo() {
		System.out.println("Pelo: Sim");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Som: Relincho");
		
	}

	@Override
	public void cor() {
		System.out.println("Cor: Branco");
		
	}
	
	public void corre() {
		System.out.println("Corre: Sim, 100 km/h");
	}

	
}
