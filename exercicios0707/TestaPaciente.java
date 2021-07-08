package br.com.generation.exercicios0707;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		
		System.out.println("===Dados Do Paciente===");
		
		paciente1.setNome(null);
		paciente1.setIdade(0);
		paciente1.setRg(0);
		paciente1.setCpf(0);
		paciente1.setEndereco(null);
		paciente1.setAno(0);
		paciente1.setProblema(null);
		
		System.out.println("Nome: " + paciente1.getNome());
		System.out.println("Idade: " + paciente1.getIdade());
		System.out.println("RG: " + paciente1.getRg());
		System.out.println("CPF: " + paciente1.getCpf());
		System.out.println("Endereço: " + paciente1.getAno());
		System.out.println("Diagnóstico: " + paciente1.getProblema());
		
		System.out.println("\n====Ações====");
		
		paciente1.entrada();
		paciente1.diagnostico();
		paciente1.passarMedico();

	}

}
