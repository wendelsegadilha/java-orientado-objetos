package br.com.wendelsegadilha.classes;

public class Funcionario {
	
	private String nome;
	private boolean ativo;
	public static boolean pago;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isAtivo() {
		return this.ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
