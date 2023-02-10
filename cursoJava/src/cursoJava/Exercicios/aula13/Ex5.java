package cursoJava.Exercicios.aula13;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double tamMetros = 0, tamCent = 0;
		
		System.out.println("Digite o tamanho em metros para ser convertido para centimetros");
		tamMetros = scan.nextDouble();
		
		tamCent = tamMetros * 100;
		
		System.out.println("Tamanho em centimetros: " + tamCent);
		
		scan.close();

	}

}
