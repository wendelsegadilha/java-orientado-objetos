package br.com.wendelsegadilha.classes;

public class Matematica {

	/**
	 * 
	 * @param um
	 * @param dois
	 * @return retorna o maior dos dois numeros
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	/**
	 * Soma uma quantidade indefinida de números
	 * @param numeros
	 * @return
	 */
	double soma(double ... numeros) { //argumentos variaveis
		
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	double media(double x, double y) {
		System.out.println("double x, double y");
		return (x + y) / 2;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	double media(String x, String y) {
		System.out.println("String x, String y");
		double ix = Double.parseDouble(x);
		double iy = Double.parseDouble(y);
		return (ix + iy) / 2;
	}
	
	/**
	 * 
	 * @param numeros
	 * @return
	 */
	double media(double ... numeros) {
		System.out.println("double ... numeros");
		return this.soma(numeros) / numeros.length;
	}
	
	/**
	 * 
	 * @param numero
	 * @return
	 */
	int raizQuadrada(int numero) {
		int cont = 0;
		for (int i = 1; i < numero; i += 2) {
			
			numero = numero - i;
			cont++;
			
			if(numero < i) {
				break;
			}
		}
		return cont;
	}

}
