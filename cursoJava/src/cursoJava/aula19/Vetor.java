package cursoJava.aula19;

public class Vetor {
	public static void main(String[] args) {
		double[] tempDoAno = new double[365];
		
		for(int i = 0; i < tempDoAno.length; i++) {
			tempDoAno[i] = i + 1;
		}
		for(int i = 0; i < 50; i++) {
			System.out.println(tempDoAno[i]);
		}
	}
}
