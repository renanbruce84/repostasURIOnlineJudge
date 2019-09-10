package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1070_SeisNumerosImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int X = scanner.nextInt();
		List<Integer> value = new ArrayList<>();
		int i = 0;

		while (value.size() < 6) {
			if (X % 2 != 0) {
				value.add(X);
				System.out.println(value.get(i));
				i++;
			}
			X++;
		}
		scanner.close();
	}

}
