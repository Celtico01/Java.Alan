package aulas.java.exercicio1;

public class aplicacao {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumConta(123);
		conta.setSaldo(1000);
		conta.setLimite(2000);
		conta.setContaEspecial(true);
		
		System.out.println("[1] Realizar Saque");
		System.out.println("[2] Realizar Deposito");
		System.out.println("[3] Consultar saldo");
		System.out.println("");

	}

}
