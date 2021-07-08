package br.com.generation.exercicios0707;

public class Funcionario {
	
	private String nome;
	private String genero;
	private String endereco;
	private int cpf;
	private int rg;
	private int idade;
	private int ano;
	private double salario;
	private String cargo;
	
	void chegada() {
		System.out.println("Funcionário chega no trabalho...");
	}
	
	void realiza() {
		System.out.println("Realiza sua determinada função...");
	}
	
	void termino() {
		System.out.println("Finaliza seu expediente...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	

}
