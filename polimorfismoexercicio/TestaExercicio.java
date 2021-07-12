package br.com.generation.polimorfismoexercicio;

public class TestaExercicio {

	public static void main(String[] args) {
		
		Animal cavalo1 = new Cavalo();
		Animal cachorro1 = new Cachorro();
		Animal preguica1 = new Preguica();
		
		System.out.println("===Dados cavalo===");
		
		cavalo1.correAnimal();
		cavalo1.somAnimal();
		
		System.out.println("===Dados cachorro===");
		
		cachorro1.correAnimal();
		cachorro1.somAnimal();
		
		System.out.println("===Dados preguiça===");
		
		preguica1.correAnimal();
		preguica1.somAnimal();
		

	}

}
