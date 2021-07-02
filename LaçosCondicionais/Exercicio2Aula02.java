package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio2Aula02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o 1º número: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		numero3 = entrada.nextInt();
		
		 if (numero1 < numero2 && numero1 < numero3) {
             
            if (numero2 < numero3 ) {
                System.out.println("Ordem correta: " + numero1 + ", " + numero2 + ", " + numero3);
                
            }
            else {
                System.out.println("Ordem correta: " + numero1 + ", " + numero3 + ", " + numero2);
            }
                                
        }    
        else if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3 ) {
                System.out.println("Ordem correta: " + numero2 + ", " + numero1 + ", " + numero3);  
            }
            else {
                
                System.out.println("Ordem correta: " + numero2 + ", " + numero3 + ", " + numero1);
            }           
        }
        else {
            if (numero1 < numero2 ) {
                
                System.out.println("Ordem correta: " + numero3 + ", " + numero1 + ", " + numero2);
                
            }
            else {
                
                System.out.println("Ordem crescente: " + numero3 + ", " + numero2 + ", " + numero1);
            }

        }

	}

}
