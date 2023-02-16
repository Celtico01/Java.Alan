package cursoJava.exercicios36.ex3;

public class Peixe extends Animal {
	private String caracteristicas;
	
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}



	public Peixe(){
		setNumPatas(0);
		setAmbiente("Mar");
		setCor("Cizenta");
		caracteristicas = "barbatanas e cauda";
	}
	
}
