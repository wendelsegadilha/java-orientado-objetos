package br.com.wendelsegadilha;

import java.util.Arrays;

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

	double soma(double um, double dois) {
		return um + dois;
	}

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
