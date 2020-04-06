package br.com.wendelsegadilha.herenca;

public class Quadrado implements AreaCalculavel{

	public double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}
	
	
}
