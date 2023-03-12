package cursoJava.exercicios44.ex1;

public class Cubo extends Figura3D{
	private double lado;
	
	Cubo() { }
	
	Cubo(double lado){
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (Math.pow(lado, 2)) * 6;
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}
}
