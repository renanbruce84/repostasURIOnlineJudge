package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1067_NumerosImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();

		if (n1 >= 1 && n1 <= 1000) {

			for (int i = 0; i <= n1; i++) {

				if (i % 2 != 0) {
					System.out.println(i);
				}
			}

		}
		scanner.close();

	}

}
