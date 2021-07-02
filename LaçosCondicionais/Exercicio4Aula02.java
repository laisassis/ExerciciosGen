package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio4Aula02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double numero1, operacao2;
	
				
		System.out.println("Digite o número: ");
		numero1 = entrada.nextDouble();
		
		if(numero1 % 2 == 0) {
			System.out.println(" Seu número é par. ");
			System.out.println("Sua raiz quadrada é: " + (Math.sqrt(numero1)));
		}
		else {
			operacao2 = numero1 * numero1;
			System.out.println("Seu número é impar. ");
			System.out.println("Seu número elevado ao quadrado é: " + operacao2);
		}
		entrada.close();
		
		
		
		
	}

}
