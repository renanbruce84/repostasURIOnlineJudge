package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class N1012_Area {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		double pi = 3.14159;
		Scanner scanner = new Scanner(System.in);

		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();

		double triangulo = (A * C) / 2;
		double raio = pi * C * C;
		double trapezio = ((A + B) * C) / 2;
		double quadrado = (B * B);
		double retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", raio);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
		scanner.close();
	}

}
