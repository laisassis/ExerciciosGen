package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03Aula03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int idade = 0, maior = 0 , menor = 0;
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();
			
			if (idade > 0 && idade < 21  ) {
				menor ++;
				
			}
			else if (idade > 50) {
				maior ++; 
				
			}
			
		}
		System.out.println("\nQuantidade de Pessoas maiores de 21 é: " + maior);
		System.out.println("\nQuantidade de Pessoas menores de 21 é : " + menor);
				
		entrada.close();
		}
	
	

}
