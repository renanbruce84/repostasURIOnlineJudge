package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1036_FormulaDeBhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		double X1 = 0.0;
		double X2 = 0.0;

		double delta = Math.sqrt(Math.pow(B, 2) - 4 * A * C);
		
		if (delta > 0) {
			X1 = (-B + delta) / (2 * A);
			X2 = (-B - delta) / (2 * A);

			System.out.printf("R1 = %.5f\n", X1);
			System.out.printf("R2 = %.5f\n", X2);
		} else {
			System.out.println("Impossivel calcular");
		}
		scanner.close();
	}

}
