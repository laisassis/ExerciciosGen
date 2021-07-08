package br.com.generation.exercicios;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
		preguica1.setNome("Magali");
		preguica1.setHorasSono(15.30);
		preguica1.setNumArvores(4);
		preguica1.setIdade(30);
		preguica1.setSom(" ZzZz...");
		
		cavalo1.setNome("Aroldo");
		cavalo1.setIdade(10);
		cavalo1.setSom("ibruhlllll.... ");
		cavalo1.setNomeCavaleiro("Miguel");
		cavalo1.setNumCelas(5);
		cavalo1.setNumFerraduras(4);
		
		cachorro1.setNome("Catarina");
		cachorro1.setIdade(4);
		cachorro1.setSom("Au... Au... Au...");
		cachorro1.setNumOssosroidos(6);
		cachorro1.setSofadestruidos(2);
		
		
		System.out.println("===Dados da Preguiça===");
		System.out.println("Nome: " + preguica1.getNome());
		System.out.println("Idade: " + preguica1.getIdade() + " anos. ");
		System.out.println("A preguiça " + preguica1.getNome() + " subiu em " + preguica1.getNumArvores() + " árvores. ");
		System.out.println("Som emitido: " + preguica1.getSom() + "\n");
		
		System.out.println("===Dados do Cavalo===");
		System.out.println("Nome: " + cavalo1.getNome());
		System.out.println("Idade" + cavalo1.getIdade() +  " anos.");
		System.out.println("Som emitido: " + cavalo1.getSom());
		System.out.println("Número de celas: " + cavalo1.getNumCelas());
		System.out.println("Nome do cavaleiro: " + cavalo1.getNomeCavaleiro() + "\n");
		
		System.out.println("===Dados do Cachorro===");
		System.out.println("Nome: " + cachorro1.getNome());
		System.out.println("Idade" + cachorro1.getIdade() +  " anos.");
		System.out.println("Som emitido: " + cachorro1.getSom());
		System.out.println("Ossos roídos: " + cachorro1.getNumOssosroidos());
		System.out.println("Sofás destruídos: " + cachorro1.getSofadestruidos());

		
		
		
		
		

	}

}
