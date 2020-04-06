package br.com.wendelsegadilha;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setNome("Wendel");
		String nome = f.getNome();
		f.setAtivo(false);
		boolean ativo = f.isAtivo();
		Funcionario.pago = true;
		teste();
		System.out.println("Nome: " + nome + "\nAtivo: " + ativo + "\npago: " + Funcionario.pago);
		
	}
	
	public static void teste() {
		Funcionario.pago = false;
		System.out.println(Funcionario.pago);
	}

}
