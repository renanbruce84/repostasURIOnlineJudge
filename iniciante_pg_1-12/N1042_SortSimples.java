package iniciante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1042_SortSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Integer> m = new ArrayList<>();
		List<Integer> n = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			n.add(scanner.nextInt());
		}

		m.addAll(n);
		

		Collections.sort(n);
		System.out.println("");

		for (int i = 0; i < 3; i++) {
			System.out.println(n.get(i));
		}
		System.out.println("");
		for (int i = 0; i < 3; i++) {
			System.out.println(m.get(i));
		}

		scanner.close();
	}

}
