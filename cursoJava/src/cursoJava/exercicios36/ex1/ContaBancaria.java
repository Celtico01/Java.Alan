package cursoJava.exercicios36.ex1;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
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
	
	protected double realizarSaque(double valorDoSaque, ContaBancaria conta) {
		if(conta.saldo >= valorDoSaque) {
			return conta.saldo - valorDoSaque;
		}
		else {
			System.out.println("Valor de saque invalido!");
			return conta.saldo;
		}
	}
	protected double realizarDeposito(double valorDoDeposito, ContaBancaria conta) {
		return conta.saldo += valorDoDeposito;
	}
}
