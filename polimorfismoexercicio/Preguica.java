package br.com.generation.polimorfismoexercicio;

public class Preguica implements Animal {

	@Override
	public void somAnimal() {
		System.out.println("Som da Preguiça: ZZZzzzZZZ...\n");
		
	}

	@Override
	public void correAnimal() {
		System.out.println("Preguiça correndo em passos lentos... ");
		
	}

}
