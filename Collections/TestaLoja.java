package br.com.generation.exercicioaula08;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaLoja {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		ArrayList<Loja> loja = new ArrayList<>();
		
		System.out.println("Adicione o número de Bolsas: ");
		int qBolsas = entrada.nextInt();
		
		for(int i = 0; i < qBolsas; i++) {
			System.out.println("Marca da bolsa: ");
			String marca = entrada.next();
			
			System.out.println("Quantidades de bolsas da marca: ");
			int quantidadeMarca = entrada.nextInt();
			
			loja.add(new Loja(marca, quantidadeMarca));
			
			}
		
		for (Loja i: loja) {
			System.out.println(i);
		}
		entrada.close();

	}

}
