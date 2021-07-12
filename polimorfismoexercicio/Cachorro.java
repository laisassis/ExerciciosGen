package br.com.generation.polimorfismoexercicio;

public class Cachorro implements Animal {
	
	

	@Override
	public void somAnimal() {
		System.out.println("Som cachorro: Au Au Au...\n");
		
	}

	@Override
	public void correAnimal() {
		System.out.println("Cachorro correndo ... ");
		
	}

}
