package br.com.wendelsegadilha;

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
