package br.com.generation.exercicioaula08;

public class Loja {
	
	private String marcaBolsas;
	private int nBolsas;
	
	
	
	public Loja(String marcaBolsas, int nBolsas) {
		super();
		this.marcaBolsas = marcaBolsas;
		this.nBolsas = nBolsas;
	}
	
	public String getMarcaBolsas() {
		return marcaBolsas;
	}
	public void setMarcaBolsas(String marcaBolsas) {
		this.marcaBolsas = marcaBolsas;
	}
	public int getnBolsas() {
		return nBolsas;
	}
	public void setnBolsas(int nBolsas) {
		this.nBolsas = nBolsas;
	} 
	
	public String toString() {
		return "[Marca da Bolsa: " + this.marcaBolsas + ", Quantidade " + this.nBolsas + "]";
	}
		
	
	
	
	
}
