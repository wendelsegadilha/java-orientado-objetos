package br.com.wendelsegadilha.polimorfismo;

public class OperacaoTeste {

	public static void main(String[] args) {
		
		calcule(new Soma(), 5.0, 4.0);
		calcule(new Multiplicacao(), 5.0, 4.0);

	}
	
	public static void calcule(OperacaoMtematica op, double x, double y ) {
		System.out.println(op.calcular(x, y));
	}

}
