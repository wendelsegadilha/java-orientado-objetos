package br.com.wendelsegadilha.excecoes;

public class Excecao {

	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes do erro");
			
			vetor[4] = 1;
			
			System.out.println("Depois do erro");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Erro capturado!");
		}
		
		System.out.println("Depois do erro ... programa continua");
	}

}
