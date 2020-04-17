package br.com.wendelsegadilha.classes;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha g1 = new Galinha();
		g1.botar().botar().botar().botar();
		
		Galinha g2 = new Galinha();
		g2.botar().botar().botar().botar().botar();
		
		System.out.println(g1.ovos);
		System.out.println(g2.ovos);
		System.out.println(Galinha.ovosDaGranja); //Chamando variavel estatica
		System.out.println(Galinha.mediaOvos(2.0));
		

	}

}
