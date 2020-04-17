package br.com.wendelsegadilha.classes;

public class CarroTeste {

	public static void main(String[] args) {
		
		//Chamando construtor vazio
		Carro Ferrari = new Carro();
		//Inicializando variaveis
		Ferrari.modelo = "Ferrari Enzo XT";
		Ferrari.velocidadeMaxima = 351;
		Ferrari.segundoZeroCem = 3;
		//Criando um motor
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		Ferrari.motor = v12; //adicionando um motor
		
		//Chamando construtor já inicializando as variaveis
		Carro Mustang = new Carro("Mustang GTX", 400, 4, new Motor("V8 TURBO", 1018));
		
		System.out.println(Mustang.modelo);
		System.out.println(Mustang.velocidadeMaxima);
		System.out.println(Mustang.segundoZeroCem);
		System.out.println(Mustang.motor.tipo);
	}

}
