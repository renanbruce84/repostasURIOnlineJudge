package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1043_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		if ((((Math.abs(b - c) < a && a < b + c)) == true) && (((Math.abs(a - c) < b && b < a + c)) == true)
				&& (((Math.abs(a - b) < c && c < a + b)) == true)) {
			double p = a + b + c;
			System.out.printf("Perimetro = %.1f", p);
		} else {
			double ar = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f", ar);

		}
		scanner.close();
	}

}
