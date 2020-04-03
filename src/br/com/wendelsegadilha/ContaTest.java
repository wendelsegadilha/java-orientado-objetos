package br.com.wendelsegadilha;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Wendel";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Venes";
		destino.saldo = 8000;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 1500);
		conta.exibeSaldo();
		destino.exibeSaldo();

	}

}
