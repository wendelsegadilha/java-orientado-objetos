package br.com.wendelsegadilha;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		System.out.println(m.media(7.0,8.0));
		System.out.println(m.media("8.0","10.0"));
		System.out.println(m.media(7.0,8.0,10.0,9.0));
	}

}
