package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio4Aula03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		int idade, sexo, humor, calmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0,
				experienteNervoso = 0, jovemCalmo = 0, cont = 0; 
		
		while(cont < 4) {
			
			System.out.println("\nQual a sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("\nVocê é do sexo: " + "\n1 - Feminino" + "\n2 - Masculino" + "\n3 - Outros");
			sexo = entrada.nextInt();
			 
			System.out.println("\nVocê se sente: " + "\n1 - Calme" + "\n2 - Nervose" + "\n3 - Agressive");
			humor = entrada.nextInt();
			cont ++;
			
			if(humor == 1) {
				calmas++; 	
			}
			
			if(sexo == 1 && humor == 2) {
				mulheresNervosas++;		
			}
			
			if(sexo == 2 && humor == 3) {
				homensAgressivos ++;
			}
			
			if(sexo == 3 && humor == 1) {
				outrosCalmos++;
			}
			
			if(idade > 40 && humor == 2) {
				experienteNervoso++;
			}
			if(idade < 18 && humor == 1) {
				jovemCalmo++;
			}
				
		}
		System.out.println("\nO número de pessoas calmas é: " + calmas);
		System.out.println("\nO número de mulheres nervosas: " + mulheresNervosas);
		System.out.println("\nO número de Homens Agressivos é: " + homensAgressivos);
		System.out.println("\nO número de Outros calmes é: " + outrosCalmos);
		System.out.println("\nO número de pessoas nervosas 40+ é: " + experienteNervoso);
		System.out.println("\nO número de pessoas calmas 18- é: " + jovemCalmo);
		
		
		entrada.close();
	}
	

}
