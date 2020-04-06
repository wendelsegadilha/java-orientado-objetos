package br.com.wendelsegadilha.herenca;

public class Cachorro extends Animal{
	
	String nome;
	
	public Cachorro(String nome) {
		super("carne", 19);
		this.nome = nome;
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Au, Au !");
	}
}
