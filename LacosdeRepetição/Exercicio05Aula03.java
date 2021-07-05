package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05Aula03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero , soma = 0; 
		
		do {
			
			System.out.println("Digite um número: " + "\nPara parar soma digite 0");
			numero = entrada.nextInt();
			
			soma += numero;
			
		}
		
		while (numero != 0); 
		
		System.out.println("A  soma dos números Digitados é: " + soma);	
		
		entrada.close();
		}
		

	}

