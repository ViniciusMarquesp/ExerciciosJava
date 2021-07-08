package br.com.generation.exercicios0707;

public class Patinete {
	
	private String marca;
	private String modelo;
	private String cor;
	private String material;
	private int peso;
	private String expecificacao;
	
	void escolha() {
		System.out.println("Aquisição do patinete...");
	}
	
	void utiliza() {
		System.out.println("Utiliza o patinete...");
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getExpecificacao() {
		return expecificacao;
	}

	public void setExpecificacao(String expecificacao) {
		this.expecificacao = expecificacao;
	}
	
	

}
