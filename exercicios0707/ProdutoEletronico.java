package br.com.generation.exercicios0707;

public class ProdutoEletronico {
	
	private String marca;
	private String modelo;
	private double preco;
	private String expecificacoes;
	
	void comprar() {
		System.out.println("Compra aquele produto");
	}
	
	void utiliza() {
		System.out.println("utiliza aquele produto");
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getExpecificacoes() {
		return expecificacoes;
	}
	public void setExpecificacoes(String expecificacoes) {
		this.expecificacoes = expecificacoes;
	}
	
	

}
