package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1037_Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		double X = scanner.nextDouble();

		if (X >= 0 && X <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (X > 25 && X <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (X > 50 && X <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (X > 75 && X <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		scanner.close();
	}

}
