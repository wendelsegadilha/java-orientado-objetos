package br.com.wendelsegadilha;

public class Carro {
	
	public String modelo;
	public int velocidadeMaxima;
	public int segundoZeroCem;
	public Motor motor;
	
	/**
	 * Construtor vazio
	 */
	public Carro() {
		
	}
	
	/**
	 * Contrutor com parametros de inicialização
	 * @param modelo
	 * @param velocidadeMaxima
	 * @param segundoZeroCem
	 */
	public Carro(String modelo, int velocidadeMaxima, int segundoZeroCem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundoZeroCem = segundoZeroCem;
		this.motor = motor;
	}

}
