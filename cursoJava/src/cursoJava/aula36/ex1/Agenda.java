package cursoJava.aula36.ex1;

public class Agenda {
	private String nome;
	private Contato[] contatos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	Agenda() { }
	
	Agenda(String nome){
		this.nome = nome;
	}
	
	
}
