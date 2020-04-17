package br.com.wendelsegadilha.excecoes;

public class DivisaoNaoInteira extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	private int den;
	
	public DivisaoNaoInteira(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "Divisão de " + this.num + " / " + this.den + " não é exata.";
	}
	
	

}
