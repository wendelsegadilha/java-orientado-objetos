package br.com.wendelsegadilha.excecoes;

public class MultiplosCatchGenerico {

	public static void main(String[] args) {
		
		int[] numeradores = {4, 8, 12, 14, 18};
		int[] denominadores = {2, 4, 0, 4};
		
		for(int i = 0; i < numeradores.length; i++) {
			try {
				System.out.println(numeradores[i] + " / " + denominadores[i] + " = " + (numeradores[i] / denominadores[i]));
			} catch (ArithmeticException e) {
				System.out.println("Não é possível dividir por zero.");
			} catch (Throwable e) {
				System.out.println("Captura qualquer tipo de exceção.");
			}
			
		}
		

	}

}
