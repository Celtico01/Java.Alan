package cursoJava.aula12;

import java.util.Scanner;

public class LeituraDoTeclado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo");
		String nomeComp = scan.nextLine();
		System.out.println("Nome completo: " + nomeComp);
		
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		System.out.println("Idade: " + idade);
		
		scan.close();
	}
}
