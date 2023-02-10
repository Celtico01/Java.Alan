package cursoJava.aula24.exercicios.ex2;

import java.util.Date;

public class ContaCorrente {
	Date data = new Date();
	
	int numConta;
	double saldo;
	boolean contaEspecial;
	double limite;
	
	double realizarSaque(double valorSaque, ContaCorrente conta) {
		if(valorSaque > conta.saldo) {
			System.out.println("O valor do saque é maior que o saldo da conta, saldo da conta:" + conta.saldo + "Tente novamente!");
			return 0;
		}
		else if(valorSaque > 0) {
			System.out.println("Saque realizado com sucesso no dia: " + data);
			return conta.saldo - valorSaque;
		}
		else {
			System.out.println("Valor de Saque invalido, tente novamente!");
			return 0;
		}
	}
	void depositarDinheiro(double valorDeposito, ContaCorrente conta) {
		if(valorDeposito > 0) {
			 conta.saldo += valorDeposito;
			 System.out.println("Deposito realizado com suceso no dia: " + data);
			 return;
		}
		else {
			System.out.println("Valor de deposito invalido!");
			return;
		}
	}
	void consultarSaldo(ContaCorrente conta) {
		System.out.println("--------------------------" + "\n\rNº da Conta: " + conta.numConta + "\n\rSaldo: " + conta.saldo + "\n\rData: " + data + "\n\r--------------------------");
	}
	boolean verificarChequeEspecial(ContaCorrente conta) {
		if(conta.contaEspecial == true) {
			return true;
		}
		else {
			return false;
		}
	}
}
