package br.com.wendelsegadilha.herenca;

public class Animal {
	
	String comida;
	double peso;
	
	public Animal(String comida, double peso) {
		this.comida = comida;
		this.peso = peso;
	}
	
	public void dormir() {
		System.out.println("Dormir...");
	}
	
	public void fazerBarulho() {
		System.out.println("Fazer barulho...");
	}

}
