package cursoJava.exercicios36.ex3;

public class Teste00 {

	public static void main(String[] args) {
		Animal camelo = new Animal();
		Peixe tubarao = new Peixe();
		Mamifero urso = new Mamifero();
		
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setNumPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(18.05);
		
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(5.27);
		
		urso.setNome("Urso");
		urso.setComprimento(180);
		urso.setNumPatas(4);
		urso.setCor("Vermelho");
		urso.setVelocidade(15.55);
		urso.setAlimento("Mel");

		exibirAnimais(camelo);
		exibirAnimais(tubarao);
		exibirAnimais(urso);
	}
	
	public static void exibirAnimais(Animal n) {
		System.out.println("----------------------------------------");
		if(n.getNome() != null) {
			System.out.println("Nome: " + n.getNome());
		}
		if(n.getComprimento() != 0 && n.getComprimento() >= 0) {
			System.out.println("Comprimento: " + n.getComprimento() + "cm");
		}
		if(n.getNumPatas() > 0) {
			System.out.println("Nº de Patas: " + n.getNumPatas());
		}
		if(n.getCor() != null) {
			System.out.println("Cor: " + n.getCor());
		}
		if(n.getAmbiente() != null) {
			System.out.println("Ambiente: " + n.getAmbiente());
		}
		if(n.getVelocidade() > 0) {
			System.out.println("Velocidade: " + n.getVelocidade() + "m/s");
		}
		System.out.println("----------------------------------------");
		System.out.println("Se alguma caracteristica não for exibida é porque ela não foi inserida ou é um valor invalido!");
	}
	
	public static void exibirAnimais(Peixe n) {
		System.out.println("----------------------------------------");
		if(n.getNome() != null) {
			System.out.println("Nome: " + n.getNome());
		}
		if(n.getComprimento() != 0 && n.getComprimento() >= 0) {
			System.out.println("Comprimento: " + n.getComprimento() + "cm");
		}
		if(n.getNumPatas() == 0) {
			System.out.println("Nº de Patas: " + n.getNumPatas());
		}
		if(n.getCor() != null) {
			System.out.println("Cor: " + n.getCor());
		}
		if(n.getAmbiente() != null) {
			System.out.println("Ambiente: " + n.getAmbiente());
		}
		if(n.getVelocidade() > 0) {
			System.out.println("Velocidade: " + n.getVelocidade() + "m/s");
		}
		if(n.getCaracteristicas() != null) {
			System.out.println("Caracteristicas: " + n.getCaracteristicas());
		}
		System.out.println("----------------------------------------");
		System.out.println("Se alguma caracteristica não for exibida é porque ela não foi inserida ou é um valor invalido!");
	}
	public static void exibirAnimais(Mamifero n) {
		System.out.println("----------------------------------------");
		if(n.getNome() != null) {
			System.out.println("Nome: " + n.getNome());
		}
		if(n.getComprimento() != 0 && n.getComprimento() >= 0) {
			System.out.println("Comprimento: " + n.getComprimento() + "cm");
		}
		if(n.getNumPatas() > 0) {
			System.out.println("Nº de Patas: " + n.getNumPatas());
		}
		if(n.getCor() != null) {
			System.out.println("Cor: " + n.getCor());
		}
		if(n.getAmbiente() != null) {
			System.out.println("Ambiente: " + n.getAmbiente());
		}
		if(n.getVelocidade() > 0) {
			System.out.println("Velocidade: " + n.getVelocidade() + "m/s");
		}
		if(n.getAlimento() != null) {
			System.out.println("Alimento: " + n.getAlimento());
		}
		System.out.println("----------------------------------------");
		System.out.println("Se alguma caracteristica não for exibida é porque ela não foi inserida ou é um valor invalido!");
	}
}
