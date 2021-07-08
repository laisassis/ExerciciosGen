package br.com.generation.exerciciosaula05;


public class Banco { 
	
	String nome;
	String Banco; 
	double deposito;
	double saque; 
	
	
	void depositar(double acrescimo) {
		deposito = deposito + acrescimo;
	}
	void sacar(double tirar) {
		saque  = saque - tirar; 
	}
	
	
	
	
	

}
