package cursoJava.exercicios36.ex1;

public final class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double realizarSaque(double valorDoSaque, ContaBancaria conta) {
		if(conta.getSaldo() >= valorDoSaque) {
			return conta.getSaldo() - valorDoSaque;
		}
		else if((conta.getSaldo() + limite) >= valorDoSaque){
			limite = limite - (valorDoSaque - conta.getSaldo());
			return 0;
		}
		else {
			System.out.println("Valor de saque invalido!");
			return conta.getSaldo();
		}
	}
	
}
