package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1040_Media_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		double n4 = scanner.nextDouble();
		double n5 = 0;
		double c1 = 0;

		double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		String x[] = { Double.toString(media) };

		c1 = Double.parseDouble(x[0].substring(0, x[0].indexOf(".") + 2));

		System.out.printf("Media: %s\n", c1);

		if (media < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		} else if (media >= 5.0 && media < 7.0) {
			
			System.out.printf("Aluno em exame.\n");
			n5 = scanner.nextDouble();
			
			System.out.printf("Nota do exame: %.1f\n", n5);
			media = (media + n5) / 2;
			String x1[] = { Double.toString(media) };
			c1 = Double.parseDouble(x1[0].substring(0, x[0].indexOf(".") + 2));

			if (media >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %s\n", c1);

		} else if (media >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		}
		scanner.close();
	}

}
