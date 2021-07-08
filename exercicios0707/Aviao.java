package br.com.generation.exercicios0707;

public class Aviao {
	
	private String marca;
    private String modelo;
    private int numPassageiros;
    private double capacidadeCombustivel;
    private String fabricante;
    private String motores;
    private int pesoMaxDecolagem;
    
    void espera() {
    	System.out.println("Esperando embarcação....");
    }
    
    void Preparando() {
    	System.out.println("Preparando decolagem....");
    }
    
    void Decolar() {
    	System.out.println("Avião decolando....");
    }
    
    void voo() {
    	System.out.println("Voando....");
    }
    
    void pouso() {
    	System.out.println("Avião pousando....");
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
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getMotores() {
		return motores;
	}
	public void setMotores(String motores) {
		this.motores = motores;
	}
	public int getPesoMaxDecolagem() {
		return pesoMaxDecolagem;
	}
	public void setPesoMaxDecolagem(int pesoMaxDecolagem) {
		this.pesoMaxDecolagem = pesoMaxDecolagem;
	}
    
    
    
    

}
