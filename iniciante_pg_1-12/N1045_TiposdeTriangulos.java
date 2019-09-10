package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1045_TiposdeTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Double> list = new ArrayList<Double>();
		double a, b, c;

		for (int i = 0; i < 3; i++) {
			list.add(scanner.nextDouble());
		}

		Collections.sort(list);
		Collections.reverse(list);

		a = list.get(0);
		b = list.get(1);
		c = list.get(2);

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (Math.pow(a, 2) == ((Math.pow(b, 2) + Math.pow(c, 2)))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(a, 2) > ((Math.pow(b, 2) + Math.pow(c, 2)))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(a, 2) < ((Math.pow(b, 2) + Math.pow(c, 2)))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && a == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		scanner.close();
	}

}
