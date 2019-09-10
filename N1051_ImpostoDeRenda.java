package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1051_ImpostoDeRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double salario;
		double calImposto = 0;

		double renda[] = { 0.0, 2000.00, 3000.00, 4500 };

		salario = scanner.nextDouble();

		if (salario >= renda[0]) {

			if (salario <= renda[1]) {
				System.out.println("Isento");
			} else {
				if (salario > renda[1] && salario <= renda[2]) {
					calImposto = (salario - 2000) * 0.08;
				} else if (salario > renda[2] && salario <= renda[3]) {
					calImposto = 1000 * 0.08 + (salario - 3000) * 0.18;
				}
				if (salario >= renda[3]) {
					calImposto = 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28;
				}

				System.out.printf("R$ %.2f\n", calImposto);
			}
		}
		scanner.close();
	}

}
