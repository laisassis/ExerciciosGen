package br.com.generation.exerciciosaula05;

public class TesteBanco {

	public static void main(String[] args) {
		
		Banco c1 = new Banco();
		
		c1.nome = "Paulo";
		c1.Banco = "Santander";
		
		c1.depositar(95.20); 
		System.out.println("Caro senhor " + c1.nome + ". ");
		System.out.println("Foi realizado depósito de " + (c1.deposito));
		System.out.println("O " + c1.Banco + " agradece pela preferência. \n" );
		System.out.println("===========================");
		
		c1.sacar(20.50);
		System.out.println("\nCaro senhor " + c1.nome + ". ");
		System.out.println("Aqui está seu saque no valor de: " + (c1.saque));
		System.out.println("O " + c1.Banco + " agradece pela preferência. " );
		
	}

}
