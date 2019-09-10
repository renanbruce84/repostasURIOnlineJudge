package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1071_SomaDeImparesConsecutivosI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		int total = 0;

		scanner.close();

		while (X < (Y - 1)) {
			X++;
			if (X % 2 != 0) {
				total = total + X;
			}
		}

		while (Y < (X - 1)) {
			Y++;
			if (Y % 2 != 0) {
				total = total + Y;
			}
		}

		System.out.println(total);

	}

}
