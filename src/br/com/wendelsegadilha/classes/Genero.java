package br.com.wendelsegadilha.classes;

public enum Genero {
	
	FEMEINO('F'), MASCULINO('M');
	
	private char valor;
	
	Genero(char valor){
		this.valor = valor;
	}
	
	public char getvalor() {
		return valor;
	}

}
