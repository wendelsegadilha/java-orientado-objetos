package br.com.wendelsegadilha.excecoes;

public class UsandoMinhaExcecao {

	public static void main(String[] args) {
		
		try {
			Dividir(4, 2);
		} catch (DivisaoNaoInteira e) { //Capturando exceção
			e.printStackTrace();
		}
	}
	
	public static void Dividir(int n1 , int n2) throws DivisaoNaoInteira{ //Lançando exceção
		
		if(n1 % 2 != 0) {
			throw new DivisaoNaoInteira(n1, n2); //Chamando minha Exception
		}else {
			System.out.println(n1 / n2);
		}
		
	}

}
