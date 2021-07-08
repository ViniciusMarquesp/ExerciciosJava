package br.com.generation.exercicios0707;

public class TestaBancaria {

	public static void main(String[] args) {
		
		bancaria banco1 = new bancaria();
		
		System.out.println("===Dados Da Conta===");
		
		banco1.setBanco(null);
		banco1.setAgencia(0);
		banco1.setConta(0);
		banco1.setNome(null);
		banco1.setExtrato(0);
		banco1.setChequeEspecial(0);
		
		System.out.println("Banco: " + banco1.getBanco());
		System.out.println("Agência: " + banco1.getAgencia());
		System.out.println("Conta: " + banco1.getConta());
		System.out.println("Nome: " + banco1.getNome());
		System.out.println("Extrato: " + banco1.getExtrato());
		System.out.println("Cheque Especial: " + banco1.getChequeEspecial());
		
		System.out.println("\n====Ações====");
		
		banco1.entrada();
		banco1.usando();
		 
	}

}
