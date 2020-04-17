package br.com.wendelsegadilha.classes;

public class EnumTeste {

	public static void main(String[] args) {
		
		for (DiaSemana dia : DiaSemana.values()) {
			imprimeDiaSemana(dia);
		}

	}
	
	
	
	public static void imprimeDiaSemana(DiaSemana dia) {
		
		switch (dia) {
		case SEGUNDA:
			System.out.println(DiaSemana.SEGUNDA);
			break;
		case TERCA:
			System.out.println(DiaSemana.TERCA);
			break;
		case QUARTA:
			System.out.println(DiaSemana.QUARTA);
			break;
		case QUINTA:
			System.out.println(DiaSemana.QUINTA);
			break;
		case SEXTA:
			System.out.println(DiaSemana.SEXTA);
			break;
		case SABADO:
			System.out.println(DiaSemana.SABADO);
			break;
		case DOMINGO:
			System.out.println(DiaSemana.DOMINGO);
			break;
		}
		
	}

}
