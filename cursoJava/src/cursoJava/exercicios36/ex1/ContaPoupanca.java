package cursoJava.exercicios36.ex1;

public final class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public double calcularNovoSaldo(double taxaRendimento) {
		return getSaldo() + (taxaRendimento / 100) * getSaldo(); 
	}

}
