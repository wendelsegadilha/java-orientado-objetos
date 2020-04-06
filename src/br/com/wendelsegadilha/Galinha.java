package br.com.wendelsegadilha;

public class Galinha {
	
	public int ovos;
	
	public static int ovosDaGranja; //Variavel pertence a classe Galinha não ao Objeto
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++; //Incrementa a variável static
		return this; //Retorna o proprio objeto Galinha
	}
	
	public static double mediaOvos(double qtdGalinha) {
		
		return Galinha.ovosDaGranja / qtdGalinha;
		
	}

}
