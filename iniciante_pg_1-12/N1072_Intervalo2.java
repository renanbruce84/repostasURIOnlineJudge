package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1072_Intervalo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int inner = 0;
		int outer = 0;

		for (int i = 0; i < N; i++) {

			int X = scanner.nextInt();
			if (X >= 10 && X <= 20) {
				inner++;
			} else {
				outer++;
			}
		}
		
		scanner.close();

		System.out.printf("%d in\n", inner);
		System.out.printf("%d out\n", outer);

	}

}
