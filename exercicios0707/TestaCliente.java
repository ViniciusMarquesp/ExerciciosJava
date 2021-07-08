package br.com.generation.exercicios0707;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Vinicius");
		cliente1.setIdade(19);
		cliente1.setGenero("Masculino");
		cliente1.setEndereco("Rua tereza");
		cliente1.setCPF(921389382);
		cliente1.setAno(12082001);
		
		System.out.println("====Dados do cliente====");
		System.out.println("\nNome: " + cliente1.getNome());
		System.out.println("Idade: " + cliente1.getIdade());
		System.out.println("Gênero: " + cliente1.getGenero());
		System.out.println("Endereço: " + cliente1.getEndereco());
		System.out.println("CPF: " + cliente1.getCPF());
		System.out.println("Nascimento: " + cliente1.getAno());
		
		cliente1.pesquisaProduto();
		cliente1.pagaProduto();
		cliente1.consome();
	

	}

}
