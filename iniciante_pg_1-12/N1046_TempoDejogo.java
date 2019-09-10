package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1046_TempoDejogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = 0;

		if (a > b) {
			a = 24 - a;
			if (a <= 24 && a > 0) {
				c = a + b;
			}
		} else if (b > a) {
			if (((b - a) >= 1) && ((b - a) < 24))
				c = b - a;
		} else if ((a == b) && (a >= 0) && (a < 24)) {
			c = 24;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)\n", c);
		scanner.close();

	}
}
