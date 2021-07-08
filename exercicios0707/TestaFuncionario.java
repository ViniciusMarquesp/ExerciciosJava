package br.com.generation.exercicios0707;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		
		System.out.println("====Dados Do Funcionário====");
		
		fun1.setNome(null);
		fun1.setGenero(null);
		fun1.setIdade(0);
		fun1.setCpf(0);
		fun1.setRg(0);
		fun1.setAno(0);
		fun1.setEndereco(null);
		fun1.setCargo(null);
		fun1.setSalario(0);
		
		System.out.println("Nome: " + fun1.getNome());
		System.out.println("Gênero: " + fun1.getGenero());
		System.out.println("Idade: " + fun1.getIdade());
		System.out.println("CPF: " + fun1.getCpf());
		System.out.println("RG: " + fun1.getCargo());
		System.out.println("Nascimento: " + fun1.getAno());
		System.out.println("Endereço: " + fun1.getEndereco());
		System.out.println("Cargo: " + fun1.getCargo());
		System.out.println("Salário: " + fun1.getSalario());
		
		System.out.println("\n====Ações====");
		
		fun1.chegada();
		fun1.realiza();
		fun1.termino();

	}

}
