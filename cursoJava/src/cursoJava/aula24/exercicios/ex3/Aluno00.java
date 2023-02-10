//packages
package cursoJava.aula24.exercicios.ex3;
//imports
import java.util.Scanner;
import java.util.Date;
import java.util.Random;

public class Aluno00 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date data = new Date();
		Random random = new Random();
		Aluno aluno00 = new Aluno();
		
		System.out.println("Insira o nome do aluno abaixo:");
		aluno00.nome = scan.nextLine();
		System.out.printf("Insira o nome do curso abaixo:");
		aluno00.nomeCurso = scan.nextLine();
		System.out.println("Gerando matricula...");
		aluno00.matricula = random.nextInt(10000000);
		
		if(aluno00.matricula < 0) {
			aluno00.matricula = aluno00.matricula + (-2 * aluno00.matricula);
		}
		
		aluno00.nomeDisciplinas = new String[3];
		aluno00.notasDisciplinas = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Insira o nome da " + (i+1) + "° disciplina abaixo");
			aluno00.nomeDisciplinas[i] = scan.nextLine();		
		}
		for(int i = 0; i < 3; i++) {
			aluno00.notasDisciplinas[i] = random.nextDouble(10);
			if(aluno00.notasDisciplinas[i] < 0) {
				aluno00.notasDisciplinas[i] = aluno00.notasDisciplinas[i] + (-2.0 * aluno00.notasDisciplinas[i]);
			}
		}
		
		aluno00.exibirDadosAluno(aluno00, data);
		aluno00.verificarAprovação(aluno00);
		
		System.out.println("Encerrando...");
		scan.close();
	}

}
