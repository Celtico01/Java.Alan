package cursoJava.exercicios36.ex1;

import java.util.Date;
import java.util.Scanner;

public class TestarClasses {

	public static void main(String[] args) {
		
		//tipo 0 = contaBancaria
		//topo 1 = contaPoupanca
		//tipo 2 = contaEspecial
		
		final int TIPO_CONTA_BANCARIA = 0;
		final int TIPO_CONTA_POUPANCA = 1;
		final int TIPO_CONTA_ESPECIAL = 2;
	
		
		Scanner scan = new Scanner(System.in);
		
		//1--
		ContaBancaria usuario0 = new ContaBancaria();
		usuario0.setNomeCliente("Murilo");
		usuario0.setNumConta(0);
		usuario0.setSaldo(500);
		//
		ContaPoupanca usuario1 = new ContaPoupanca();
		usuario1.setNomeCliente("Alan");
		usuario1.setNumConta(1);
		usuario1.setSaldo(300);
		usuario1.setDiaRendimento(2);
		//
		ContaEspecial usuario2 = new ContaEspecial();
		usuario2.setNomeCliente("Pedro");
		usuario2.setNumConta(2);
		usuario2.setSaldo(1000);
		usuario2.setLimite(2000);
		//
		int escolha = 5;
		while(escolha != 0) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("Apenas para contas poupancas!");
			System.out.println("[1] Sacar");
			System.out.println("[2] Depositar");
			System.out.println("[3] Exibir Dados");
			System.out.println("[0] Encerrar Sistema");
			System.out.println("-------------------------------------------------------------");
			escolha = scan.nextInt();
			
			switch(escolha) {
			case 1:
				System.out.print("Valor do Saque: ");
				usuario1.setSaldo(usuario1.realizarSaque(scan.nextDouble()));
				System.out.println("Saldo atual: " + usuario1.getSaldo());
				break;
			case 2:
				System.out.print("Valor do Deposito: ");
				usuario1.setSaldo(usuario1.realizarDeposito(scan.nextDouble()));
				System.out.println("Saldo atual: " + usuario1.getSaldo());
				break;
			case 3:
				exibirUsuario(TIPO_CONTA_POUPANCA, usuario1, null);
				break;
			}
			
		}
		
		
		
		
		scan.close();

	}
	//se não tiver conta Especial passar variavel como null!
		public static void exibirUsuario(int tipoConta, ContaPoupanca conta, ContaEspecial v2Conta) {
			Date data = new Date();
			if(tipoConta == 0) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("Nome: " + conta.getNomeCliente());
				System.out.println("Nº da Conta: " + conta.getNumConta());
				System.out.println("Saldo:" + conta.getSaldo());
				System.out.println("Data: " + data);
				System.out.println("-------------------------------------------------------------");
			}
			else if(tipoConta == 1) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("Nome: " + conta.getNomeCliente());
				System.out.println("Nº da Conta: " + conta.getNumConta());
				System.out.println("Saldo:" + conta.getSaldo());
				System.out.println("Dia de Rendimento: " + conta.getDiaRendimento());
				System.out.println("Data: " + data);
				System.out.println("-------------------------------------------------------------");
			}
			else if(tipoConta == 2) {
				System.out.println("-------------------------------------------------------------");
				System.out.println("Nome: " + conta.getNomeCliente());
				System.out.println("Nº da Conta: " + conta.getNumConta());
				System.out.println("Saldo:" + conta.getSaldo());
				System.out.println("Limite: " + v2Conta.getLimite());
				System.out.println("Data: " + data);
				System.out.println("-------------------------------------------------------------");
			}
			else {
				System.out.println("Tipo de conta invalida!");
				System.out.println("Data: " + data);
			}
		}
}	
	

