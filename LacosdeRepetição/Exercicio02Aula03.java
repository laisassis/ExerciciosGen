package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02Aula03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int par = 0; 
		int impar = 0;
		
		for(int i = 0; i <= 10; i++) {
			
				System.out.println("Digite um n�mero: " );
				i = entrada.nextInt(); 
			
			if(i % 2 == 0 ) {
				par ++;	
			}
			else {
				impar++;			
			}
		}
		System.out.println("\nA quantidade de n�meros pares �: " + par);
		System.out.println("\nA quantidade de n�meros impares �: " + impar);	
		
		entrada.close();
	}
}