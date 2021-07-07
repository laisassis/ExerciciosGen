package br.com.generation.exerciciosaula04;

import java.util.Scanner;

public class Exercicio1Aula04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
		double[] notas = new double [5];
		double maiorNota = 0.0; 
		int i;
		 
		 System.out.println("Digite as 5 notas do Aluno: ");
		 //Adicionando Valores no Vetor
		 for(i = 0; i <= 4; i++) {
			 notas[i] = entrada.nextDouble();
			
			 if(notas[i] > maiorNota) {
				 maiorNota = notas[i]; 
			 }
		 }
		
		 //Coletando os Valores.
		 for(i = 0; i <= 4; i++) {
			 System.out.println("Nota: \n " + notas[i]);
		 }
		 System.out.println("A maior nota é: " + maiorNota);
		 
		
		 
		 }
		 

	}


