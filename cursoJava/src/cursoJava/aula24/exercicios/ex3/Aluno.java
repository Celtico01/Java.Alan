package cursoJava.aula24.exercicios.ex3;

import java.util.Date;

public class Aluno {
	String nome;
	int matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[] notasDisciplinas;
	
	void verificarAprovação(Aluno aluno) {
		for(int i = 0; i < 3; i++) {
			if(aluno.notasDisciplinas[i] >= 7) {
				System.out.println("Aprovado na discplina: " + aluno.nomeDisciplinas[i] + "\n\rNota: " + aluno.notasDisciplinas[i]);
			}
			else {
				System.out.println("Não atingiu a nota suficiente na disciplina: " + aluno.nomeDisciplinas[i] + "\n\rNota: " + aluno.notasDisciplinas[i]);
			}
		}
	}
	void exibirDadosAluno(Aluno aluno, Date data) {
		System.out.println("------------------------------------------------------------");
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Matricula: " + aluno.matricula);
		System.out.println("Nome do Curso: " + aluno.nomeCurso);
		System.out.println("Data:" + data);
		System.out.println("------------------------------------------------------------");
	}
	
}
