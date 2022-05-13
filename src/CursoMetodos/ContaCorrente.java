package CursoMetodos;

public class ContaCorrente {
	/* ATIVIDADE EXTRE CURSO
	 * 2. Cria uma classe para representar uma conta corrente que possui um número,
	 * um saldo, um status que informa se ela é especial ou não, um limite.
	 * Desenvolva métodos para realizar saque (verificando se o cliente pode
	 * realizar saques), despositar dinheiro, consultar saldo e verificar se o
	 * cliente está usando cheque especial ou não. Desenvolva um programa para
	 * testar essa classe.
	 */

	String numeroConta;
	String agencia;
	String titular;
	String tipoConta;
	double saldo;
	boolean contaEspecial;
	double valorEspecialUsado;
	double limiteEspecial;
	double limite;

	public boolean sacar(double valor) {
		if (saldo >= valor) { // tem saldo na conta
			saldo = saldo - valor;
			return true;
		} else { // não tem saldo na conta
			if (contaEspecial) {
				// verificar se o limite especial tem saldo
				double limite = limiteEspecial - saldo;
				if (limite <= valor) {
					saldo = saldo - valor;
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println("Saque inválido, por não ser optante do cheque especial.");
				return false; // não é especial e não tem saldo suficiente.
			}
		}
	}

	public double depositar(double valor) {
		saldo += valor;
		return saldo;
	}
	
	public void consultarSaldo () {
		System.out.println("Seu saldo é de: " + saldo);	
	}
}
