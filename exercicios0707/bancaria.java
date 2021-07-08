package br.com.generation.exercicios0707;

public class bancaria {
	
	private String nome;
	private String banco;
	private int agencia;
	private int conta;
	private int chequeEspecial;
	private int extrato;
	
	void entrada() {
		System.out.println("Cliente acessando...");
	}
	
	void usando() {
		System.out.println("Cliente usando a conta...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public int getExtrato() {
		return extrato;
	}

	public void setExtrato(int extrato) {
		this.extrato = extrato;
	}
	
	

}
