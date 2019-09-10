package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1073_QuadradoDePares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		scanner.close();

		if (N > 5 && N < 2000) {
			for (int i = 2; i <= N; i += 2) {
				if (i % 2 == 0) {
					System.out.printf("%d^2 = %d\n", i, (int) (Math.pow(i, 2)));
				}
			}
		}

	}

}
