package br.com.generation.exercicios0707;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete pat1 = new Patinete();
		
		System.out.println("====Dados Do Patinete====");
		
		pat1.setMarca(null);
		pat1.setModelo(null);
		pat1.setCor(null);
		pat1.setMaterial(null);
		pat1.setPeso(0);
		pat1.setExpecificacao(null);
		
		System.out.println("marca: " + pat1.getMarca());
		System.out.println("Modelo: " + pat1.getModelo());
		System.out.println("Cor: " + pat1.getCor());
		System.out.println("Material: " + pat1.getMaterial());
		System.out.println("Peso :" + pat1.getPeso());
		System.out.println("Expecificações: " + pat1.getExpecificacao());
		
		System.out.println("\n====Ações====");
		
		pat1.escolha();
		pat1.utiliza();

	}

}
