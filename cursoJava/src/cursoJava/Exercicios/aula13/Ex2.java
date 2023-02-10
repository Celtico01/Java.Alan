package cursoJava.Exercicios.aula13;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int mostrarNum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		mostrarNum = scan.nextInt();
		System.out.println("Numero digitado: " + mostrarNum);
		
		scan.close();
	}

}
