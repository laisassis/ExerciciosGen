package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio6Aula03 {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner (System.in);
		
		int numero, multiplos = 0 , soma = 0; 
				
		do { 
			
			System.out.println("insira um n�mero: ");
			numero = entrada.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				multiplos++; 
				soma += numero;	
			}
		}
		
		while(numero != 0);
			System.out.println("\nA m�dia dos m�ltiplos de 3 �: " + soma / multiplos);
		
	}
}




