package br.com.wendelsegadilha;

public class FormularioTeste {

	public static void main(String[] args) {
		
		Formulario f = new Formulario();
		f.nome = "Wendel";
		f.email = "wendelsegadilha99@gmail.com";
		f.genero = Genero.MASCULINO;
		
		System.out.println(f.email);
		System.out.println(f.email);
		System.out.println(f.genero.toString() + " - " + f.genero.getvalor());

	}

}
