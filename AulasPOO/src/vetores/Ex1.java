package vetores;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] v1 = new int[10], v2 = new int[10];
		
		for(int i = 0; i < 10; i++) {
			v1[i] = rand.nextInt(100);
			v2[i] = rand.nextInt(100);
		}
		
		int[] vSoma = new int[20];
		int j = 0;
		int h = 0;
		for(int i = 0; i < 20; i++) {
			if(i % 2 == 0) {
				vSoma[i] = v1[j];
				j++;
			}
			else {
				vSoma[i] = v2[h];
				h++;
			}
		}
		for(int i = 0; i < 20; i++) {
			System.out.println("Número "+ (i + 1)+ "º" + " = " + vSoma[i]);
		}
	}
}


