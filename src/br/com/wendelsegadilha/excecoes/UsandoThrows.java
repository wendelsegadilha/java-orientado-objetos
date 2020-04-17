package br.com.wendelsegadilha.excecoes;

import java.util.Scanner;

public class UsandoThrows {
	
	public static void main(String[] args) {
		
		System.out.println("Entre com um valor: ");
		try {
			lerDados();
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
		
	}
	
	public static void lerDados() throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		Double valor = scanner.nextDouble();
	}

}
