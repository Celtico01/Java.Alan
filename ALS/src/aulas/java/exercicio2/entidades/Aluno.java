package aulas.java.exercicio2.entidades;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public Aluno() { }
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
}
