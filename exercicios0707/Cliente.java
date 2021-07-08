package br.com.generation.exercicios0707;

public class Cliente {
	
	private String nome;
	private String Genero;
	private String endereco;
	private int CPF;
	private int idade;
	private int ano;
	
	
	void pesquisaProduto() {
		System.out.println("O cliente está decidindo se quer o produto...");
	}
	
	void pagaProduto() {
		System.out.println("Cliente está pagando o produto...");
	}
	
	void consome() {
		System.out.println("O cliente está consumindo o produto....");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
