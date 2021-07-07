package br.com.generation.exerciciosaula04;

import java.util.Scanner;

public class Exercicio2Aula04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double[] dados = new double [10];
		double soma = 0, media = 0, maiorNota = 0;
		int cont = 0, i;
		
		System.out.println("Digite os dados: ");
		for(i = 0; i < dados.length; i++) {
			dados[i] = entrada.nextDouble();
			if(dados[i] > maiorNota) {
				maiorNota = dados[i];
				cont = 0;
			}
			if(dados[i] == maiorNota) {
				cont++;
			}
		}
		for(i = 0; i <= 9; i++) {
			System.out.println(i + " | " + dados[i]);
		}
		for(i = 0; i <= 9; i++) {
			soma = soma + dados[i]; 
			media = soma / 10;
		}
		System.out.println("A média dos dados é: " + media);
		System.out.println("A maior nota apareceu " + cont  + " vezes: ");
	} 

}
