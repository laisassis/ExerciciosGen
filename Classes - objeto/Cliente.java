package br.com.generation.exerciciosaula05;

public class Cliente {
	
	//Atributos
	String nome; 
	String marcaPreferida;
	int idade;
	int nCompras;
	 
	
	
	//Métodos
		void olharLoja() {
		System.out.println("Cliente olhando Loja...");
	}
	void experimentar() {
		System.out.println("Cliente experimentando...");
	}
	void numeroCompras (int quantidade) {
		nCompras = nCompras + quantidade;		
	}
	void devolver (int devolucao) {
		nCompras = nCompras - devolucao;
		
	}
		

}
