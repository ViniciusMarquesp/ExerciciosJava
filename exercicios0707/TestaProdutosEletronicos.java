package br.com.generation.exercicios0707;

public class TestaProdutosEletronicos {

	public static void main(String[] args) {
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		System.out.println("====Dados Do Porduto Escolhido====");
		
		produto1.setMarca(null);
		produto1.setModelo(null);
		produto1.setPreco(0);
		produto1.setExpecificacoes(null);
		
		System.out.println("Marca: " + produto1.getMarca());
		System.out.println("Modelo: " + produto1.getModelo());
		System.out.println("Preço: " + produto1.getPreco());
		System.out.println("Expecificações: " + produto1.getExpecificacoes());
		
		System.out.println("====Ações====");
		produto1.comprar();
		produto1.utiliza();

	}

}
