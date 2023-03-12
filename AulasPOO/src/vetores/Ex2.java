package vetores;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		Random rand = new Random();

		int n = 20;
		int v[] = new int[n];

		for (int i = 0; i < v.length; i++) {
			System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
			v[i] = rand.nextInt(100);
		}

		int soma = 0;
		int menor = v[0]; 
		int maior = v[0];
		for (int i = 0; i < v.length; i++) {
			soma = soma + v[i];

			if (v[i] < menor)
				menor = v[i];

			if (v[i] > maior)
				maior = v[i];
		}

		System.out.printf("\n");
		for (int i = 0; i < v.length; i++) {
			if (v[i] == menor)
				System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
			else if (v[i] == maior)
				System.out.printf("v[%d] = %2d <--- maior valor\n", i,
						v[i]);
			else System.out.printf("v[%d] = %2d\n", i, v[i]);
		}

		System.out.printf("\nSoma = %d\n", soma);
	}
 }