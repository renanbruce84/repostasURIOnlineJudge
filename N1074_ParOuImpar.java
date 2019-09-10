package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1074_ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		if (N < 10000) {
			for (int i = 0; i < N; i++) {
				int X = scanner.nextInt();

				if (X != 0) {
					if (X % 2 == 0) {
						System.out.printf("EVEN ");
					} else {
						System.out.printf("ODD ");
					}
				}

				if (X > 0) {
					System.out.printf("POSITIVE\n");
				}
				if (X < 0) {
					System.out.printf("NEGATIVE\n");
				}
				if (X == 0) {
					System.out.printf("NULL\n");
				}

			}

		}
		scanner.close();
	}

}
