package br.com.wendelsegadilha.innerclasses;

class ClasseExterna {
	private int x;
	
	public ClasseExterna(int valor) {
		x = valor;
	}
	
	public void roda() {
		ClasseInterna ci = new ClasseInterna();
		ci.imprimeX();
	}

	public class ClasseInterna {
		int y;
		
		public void imprimeX() {
			System.out.println(x);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		ClasseExterna ce = new ClasseExterna(5);
		ce.roda();
	}
}
