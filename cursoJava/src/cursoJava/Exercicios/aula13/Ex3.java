package cursoJava.Exercicios.aula13;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, resultado;
		
		System.out.println("Digite o primeiro numero ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo numero ");
		num2 = scan.nextInt();
		
		resultado = num1 + num2;
		
		System.out.println("A soma e: " + resultado);
		
		scan.close();
	}
}
