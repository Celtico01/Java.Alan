package cursoJava.exercicios44.ex1;

public class Cilindro extends Figura3D{
	private double raio;
	private double altura;
	
	Cilindro() { }
	
	Cilindro(double raio, double altura){
		this.raio = raio;
		this.altura = altura;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		return 2 * Math.PI * raio * (altura + raio);
	}
	@Override
	public double calcularVolume() {
		return Math.PI * (Math.pow(raio, 2)) * altura;
	}
}
