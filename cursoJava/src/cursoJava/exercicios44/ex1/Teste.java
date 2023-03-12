package cursoJava.exercicios44.ex1;

public class Teste {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(2.5);
		Quadrado quadrado = new Quadrado(4);
		Triangulo triangulo = new Triangulo(4, 8);
		Cubo cubo = new Cubo(4);
		Cilindro cilindro = new Cilindro(6, 12);
		Piramide piramide = new Piramide(8, 6, 14, quadrado);
		
		FiguraGeometrica[] array = new FiguraGeometrica[6];
		
		array[0] = circulo;
		array[1] = quadrado;
		array[2] = triangulo;
		array[3] = cubo;
		array[4] = cilindro;
		array[5] = piramide;
		
		for(int i = 0; i < 6; i++) {
			if(array[i] instanceof Figura2D) {
				Figura2D figura2d = (Figura2D) array[i];
				System.out.println("===============FIGURA 2D===============");
				System.out.println("Area: " + figura2d.calcularArea());
			}
			else if(array[i] instanceof Figura3D) {
				Figura3D figura3d = (Figura3D) array[i];
				System.out.println("===============FIGURA 3D===============");
				System.out.println("Area: " + figura3d.calcularArea());
				System.out.println("Volume: " + figura3d.calcularVolume());
			}
		}
		
	}

}
