package cursoJava.aula24.exercicios.ex1;

import java.util.Scanner;

public class testeLamp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lampada lamp = new Lampada();
		
		lamp.modelo = "PHILIPS";
		lamp.tipoLuz = "LED";
		lamp.potenciaWatts = 7;
		lamp.baseLampada = "E27";
		lamp.corLuz = "Branco frio";
		
		System.out.println("[0]Para desligar.");
		System.out.println("[1]Para ligar.");
		int escolha = scan.nextInt();
		lamp.luz = lamp.desligar_ligarLamp(lamp, escolha);
		
		if(lamp.luz == true) {
			System.out.println("A luz foi ligada\n\r" + lamp.luz);
		}
		else {
			System.out.println("A luz foi desligada\n\r" + lamp.luz);
		}
		
		scan.close();
		
	}
}
