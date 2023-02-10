package aulas.java.exercicio1;

import java.util.Date;
import java.util.Scanner;

public class ContaCorrente {
	Date data = new Date();
	Scanner scan = new Scanner(System.in);
	
	private int numConta;
	private double saldo;
	private double limite;
	private boolean contaEspecial;
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public boolean isContaEspecial() {
		return contaEspecial;
	}
	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
	public double realizarSaque(double valorDoSaque, double saldo) {
		if(saldo >= valorDoSaque) {
			return (saldo - valorDoSaque);
		}
		else {
			return saldo;
		}
	}
	public double realizarDeposito(double saldo) {
		System.out.println("Insira o valor do deposito abaixo:");
		double valorDeposito = scan.nextDouble();
		return (saldo + valorDeposito);
	}
	
	public void consultarSaldo(int numConta, double saldo, double limite, boolean contaEspecial) {
		System.out.println("Num. Conta: " + numConta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println("Conta Especial: " + contaEspecial);
		System.out.println("Data: " + data);
	}
	
	
	
}
