package cursoJava.exercicios36.ex3;

public class Mamifero extends Animal {
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public Mamifero(){
		setAmbiente("Terra");
	}
	
	
}
