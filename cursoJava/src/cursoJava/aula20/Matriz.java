package cursoJava.aula20;

public class Matriz {

	public static void main(String[] args) {
		double[][] testeMatriz = new double[5][5];
		
		
		for(int i = 0; i < testeMatriz.length; i++) {
			for(int j = 0; j < testeMatriz[i].length; j++){
				testeMatriz[i][j] = i + j;
			}
		}
		for(int i = 0; i < testeMatriz.length; i++) {
			for(int j = 0; j < testeMatriz[i].length; j++){
				System.out.println("P1:" + i + ",P2:" + j + "CONT: " + testeMatriz[i][j]);
			}
		}

	}

}
