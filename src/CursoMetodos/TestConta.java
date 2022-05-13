package CursoMetodos;


public class TestConta {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numeroConta = "123456";
		conta.agencia = "123";
		conta.contaEspecial = false;
		conta.limiteEspecial = 1000;
		conta.valorEspecialUsado = 0;
		conta.saldo = 500;

		// consultando o saldo:
		conta.consultarSaldo();
	

		System.out.println("Realizando depósito...");
		conta.depositar(700);
		conta.consultarSaldo();
		System.out.println();

		// Realizando retirada:
		conta.sacar(1500);
		conta.consultarSaldo();
	}

}
