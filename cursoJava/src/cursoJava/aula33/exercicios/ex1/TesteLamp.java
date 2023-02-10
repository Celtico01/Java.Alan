package cursoJava.aula33.exercicios.ex1;

import java.util.Scanner;

public class TesteLamp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lampada lamp = new Lampada(true);
		
		lamp.setModelo("PHILIPS");
		lamp.setModelo("LED");
		lamp.setPotenciaWatts(7);
		lamp.setBaseLampada("E27");
		lamp.setCorLuz("Branco frio");
		
		if(lamp.isLuz() == true) {
			System.out.println("A luz esta ligada");
		}
		else {
			System.out.println("A luz esta desligada");
		}
		
		System.out.println("[0]Para desligar.");
		System.out.println("[1]Para ligar.");
		int escolha = scan.nextInt();
		lamp.setLuz( lamp.desligar_ligarLamp(lamp, escolha));
		
		if(lamp.isLuz() == true) {
			System.out.println("A luz foi ligada");
		}
		else {
			System.out.println("A luz foi desligada");
		}
		
		scan.close();
		
	}
}
