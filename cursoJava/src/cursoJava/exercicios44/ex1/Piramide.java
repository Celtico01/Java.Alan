package cursoJava.exercicios44.ex1;

public class Piramide extends Figura3D{
	private double altura;
	private double arestaBase;
	private double apotema;
	
	private Figura2D areaBase;
	
	Piramide() { }
	
	Piramide(double altura, double arestaBase, double apotema, Figura2D areaBase){
		this.altura = altura;
		this.arestaBase = arestaBase;
		this.apotema = apotema;
		this.areaBase = areaBase;
	}

	public Figura2D getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(Figura2D areaBase) {
		this.areaBase = areaBase;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public double calcularArea() {
		if(areaBase instanceof Quadrado) {
			return (4 * (arestaBase * apotema / 2)) + areaBase.calcularArea();
		}
		else if(areaBase instanceof Triangulo){
			return (3 * (arestaBase * apotema / 2)) + areaBase.calcularArea();
		}
		else {
			return 0;
		}
	}

	public double calcularVolume() {
		return areaBase.calcularArea() * altura / 3;
	}
}
