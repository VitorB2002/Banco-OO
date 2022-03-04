package banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente vitor = new Cliente();
		vitor.setNome("Vitor Borges");
		
		Conta cc = new ContaCorrente(vitor);
		Conta poupanca = new ContaPoupanca(vitor);
		
		cc.depositar(500);
		cc.transferir(250, poupanca);
		
		poupanca.imprimirExtrato();
	}

}
