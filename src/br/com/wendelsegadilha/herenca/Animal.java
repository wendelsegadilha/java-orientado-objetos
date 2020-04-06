package br.com.wendelsegadilha.herenca;

public abstract class Animal {
	
	String comida;
	double peso;
	
	public Animal(String comida, double peso) {
		this.comida = comida;
		this.peso = peso;
	}
	
	public void dormir() {
		System.out.println("Dormir...");
	}
	
	public abstract void fazerBarulho();

}
