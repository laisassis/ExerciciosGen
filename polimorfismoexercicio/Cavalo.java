package br.com.generation.polimorfismoexercicio;

public class Cavalo implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("Som do cavalo: Relinchar...\n");
		
	}

	@Override
	public void correAnimal() {
		System.out.println("Cavalo correndo: Pocotó... Pocotó... Pocotó... ");
		
	}

}
