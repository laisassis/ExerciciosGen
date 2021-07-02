package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio1Aula02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		int numero1 = 0, numero2 = 0, numero3 = 0, resultado;
		
		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		numero3 = entrada.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			resultado = numero1;
			System.out.println("O maior número é: " + resultado);
		}
		else if(numero2 > numero1 && numero2 > numero3) {
			resultado = numero2;
			System.out.println("O maior número é: " + resultado);
		}
		else if(numero3 > numero1 && numero3 > numero2) {
			resultado = numero3;
			System.out.println("O maior número é: " + resultado);
		}
		
		entrada.close();
		

	}

}
