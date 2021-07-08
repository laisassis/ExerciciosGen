package br.com.generation.exerciciosaula05;

public class TestaCliente {

	public static void main(String[] args) {
		
		//Instância
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		
		// add valores
		cliente1.nome = "Eva"; 
		cliente1.idade = 34;
		cliente1.marcaPreferida = "LUPO";
		cliente1.nCompras = 0;
		
		
		
		cliente1.numeroCompras(5);
		System.out.println("Nome do cliente: " + cliente1.nome);
		System.out.println("Marca preferida: " + cliente1.marcaPreferida);
		
		cliente1.olharLoja();
		cliente1.experimentar();
		
		System.out.println("número de compras:  " + cliente1.nCompras);

		cliente1.devolver(2);
		System.out.println("Total de Compras (Sem devoluções) :  " + cliente1.nCompras);
		
		
		
		System.out.println("\n===========================\n");
		
		cliente2.nome = "Adão"; 
		cliente2.idade = 21;
		cliente2.marcaPreferida = "MASH";
		cliente2.nCompras = 0;
		
		cliente2.numeroCompras(9);
		System.out.println("Nome do cliente: " + cliente2.nome);
		System.out.println("Marca preferida: " + cliente2.marcaPreferida);
		
		cliente2.olharLoja();
		cliente2.experimentar();
		
		System.out.println("número de compras:  " + cliente2.nCompras);
		
		cliente2.devolver(1);
		System.out.println("Total de compras (Sem devoluções): " + cliente2.nCompras);
		
		
		

	}

}
