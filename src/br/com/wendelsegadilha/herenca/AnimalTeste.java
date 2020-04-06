package br.com.wendelsegadilha.herenca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro("Toto");
		
		Galinha carijo = new Galinha();
		carijo.comida = "milho";
		
		System.out.println(toto.equals(carijo));
		
		System.out.println(toto.hashCode());
		
		System.out.println(toto.getClass());
		
	}

}
