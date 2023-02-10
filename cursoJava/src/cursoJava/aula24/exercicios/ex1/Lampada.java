package cursoJava.aula24.exercicios.ex1;

public class Lampada {
	String modelo;
	String tipoLuz;
	int potenciaWatts;
	String baseLampada;
	String corLuz;
	boolean luz;
	
	boolean desligar_ligarLamp(Lampada lamp, int escolha) {
		if(escolha == 0) {
			return false;
		}
		else if(escolha == 1) {
			return true;
		}
		else {
			if(lamp.luz == true) {
				System.out.println("Comando invalido!");
				return true;
			}
			else {
				System.out.println("Comando invalido!");
				return false;
			}
				
		}
	}
}
