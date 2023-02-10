package cursoJava.aula24.exercicios.ex2;

import java.util.Scanner;

public class NovaConta {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		
		int escolha = 0;
		
		conta.numConta = 123;
		conta.saldo = 1000;
		conta.limite = 500;
		conta.contaEspecial = true;
		
		do {
			System.out.println("[1] Realizar Saque");
			System.out.println("[2] Depositar Dinheiro");
			System.out.println("[3] Consultar Saldo");
			System.out.println("[4] Verificar Cheque Especial");
			System.out.println("[0] Para Encerrar a Operação");
			escolha = scan.nextInt();
			
			if(escolha == 1) {
				System.out.println("Insira o Valor que deseja retirar, Saldo atual: " + conta.saldo);
				double valorSaque = scan.nextDouble();
				double novoValorSaldo = conta.realizarSaque(valorSaque, conta);
				conta.saldo = novoValorSaldo;
			}
			else if(escolha == 2) {
				System.out.println("Insira o valor que deseja depositar");
				double valorDeposito = scan.nextDouble();
				conta.depositarDinheiro(valorDeposito, conta);
			}
			else if(escolha == 3) {
				conta.consultarSaldo(conta);
			}
			else if(escolha == 4) {
				boolean verificar = conta.verificarChequeEspecial(conta);
				if(verificar == true) {
					System.out.println("A conta é especial!");
				}
				else {
					System.out.println("A conta não é especial");
				}
			}
			else if(escolha == 0) {
				System.out.println("Encerrando...");
			}
			else {
				System.out.println("Escolha invalida, tente novamente");
			}
		}while(escolha != 0);
			
		
		
		
		scan.close();
	}
}
