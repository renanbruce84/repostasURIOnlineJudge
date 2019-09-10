package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1060_NumerosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int nPositivos = 0;

		for (int j = 0; j < 6; j++) {
			double i = scanner.nextDouble();
			if (i > 0) {
				nPositivos++;
			}
		}
		System.out.printf("%d valores positivos\n", nPositivos);
		scanner.close();
	}

}
