package br.com.wendelsegadilha;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		double so = m.soma(5, 7);
		System.out.println(so);
		
		double soma = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(soma);
		
		
		int raiz = m.raizQuadrada(27);
		System.out.println(raiz);
		
	}

}
