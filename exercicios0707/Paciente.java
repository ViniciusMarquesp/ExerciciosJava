package br.com.generation.exercicios0707;

public class Paciente {

	private String nome;
	private int idade;
	private String genero;
	private String endereco;
	private int cpf;
	private int rg;
	private int ano;
	private String problema;
	
	void entrada() {
		System.out.println("Entrada no hospital...");
	}
	
	void diagnostico() {
		System.out.println("Fazer o diagnóstico para encontrar o problema...");
	}
	
	void passarMedico() {
		System.out.println("Sendo medicado...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}
	
	
}
