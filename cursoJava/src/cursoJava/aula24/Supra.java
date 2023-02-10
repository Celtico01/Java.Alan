package cursoJava.aula24;

public class Supra {
	public static void main(String[] args) {
		Carro supra = new Carro();
		
		supra.marca = "Toyota";
		supra.modelo = "A80";
		supra.cavalosForca = 325;
		supra.anoLancamento = 1993;
		
		supra.exibirAnoLancamento();
	}
}
