package cursoJava.exercicios44.ex1;

public class Quadrado extends Figura2D{
	private double lado;

	Quadrado() { }
	
	Quadrado(double lado){
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return Math.pow(lado, 2);
	}	
}
