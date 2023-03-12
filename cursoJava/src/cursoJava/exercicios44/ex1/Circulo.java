package cursoJava.exercicios44.ex1;

public class Circulo extends Figura2D{
	private double raio;

	Circulo() { }
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		raio = Math.pow(raio, 2);
		return Math.PI * raio;
	}
}
