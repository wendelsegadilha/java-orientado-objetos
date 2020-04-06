package br.com.wendelsegadilha.herenca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro("Totó");
		Galinha carijo = new Galinha();
		
		//barulho(toto);
		//barulho(carijo);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
	}
	
	//recebe um animal generico
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	public static void barulhoSemPolimorfismo(String animal) {
		
		if(animal.equals("Cachorro")) {
			System.out.println("Au, Au !");
		}else if(animal.equals("Galinha")) {
			System.out.println("Có, Có !");
		}
		
	}

}
