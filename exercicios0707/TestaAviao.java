package br.com.generation.exercicios0707;

public class TestaAviao {
	
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		System.out.println("=====Dados Do Avi�o====");
		
		aviao1.setMarca(null);
		aviao1.setFabricante(null);
		aviao1.setModelo(null);
		aviao1.setCapacidadeCombustivel(0);
		aviao1.setNumPassageiros(0);
		aviao1.setMotores(null);
		aviao1.setPesoMaxDecolagem(0);
		
		System.out.println("A Marca �: " + aviao1.getMarca());
		System.out.println("Fabricado por: " + aviao1.getFabricante());
		System.out.println("Modelo: " + aviao1.getModelo());
		System.out.println("Capacidade De Combust�vel: " + aviao1.getCapacidadeCombustivel());
		System.out.println("Capacidade de passageiros: " + aviao1.getNumPassageiros());
		System.out.println("Motores: " + aviao1.getMotores());
		System.out.println("Peso m�ximo na decolagem: " + aviao1.getPesoMaxDecolagem());
		
		System.out.println("\n=====A��es do Avi�o=====");
		
		aviao1.espera();
		aviao1.Preparando();
		aviao1.Decolar();
		aviao1.voo();
		aviao1.pouso();
	}

}
