package br.com.wendelsegadilha.classes;

public class Formulario {

	public String nome;
	public String email;
	public Genero genero;
	
	public Formulario() {
		
	}

	public Formulario(String nome, String email, Genero genero) {
		this.nome = nome;
		this.email = email;
		this.genero = genero;
	}

}
