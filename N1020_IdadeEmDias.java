package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1020_IdadeEmDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();//dias
		Integer values[] = { 365, 30, 1 };
		Integer calIdade[] = new Integer[4];

		for (int i = 0; i < values.length; i++) {
			calIdade[i] = n / values[i];
			n = n % values[i];
		}

		System.out.println(calIdade[0]+" ano(s)");
		System.out.println(calIdade[1]+" mes(es)");
		System.out.println(calIdade[2]+" dia(s)");
		scanner.close();
	}

}
