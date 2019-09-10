package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1048_AumentoDeSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double salario = scanner.nextDouble();
		double novoSalario = 0;
		double reajuste = 0;
		int porcent = 0;
		int values[] = { 15, 12, 10, 7, 4 };
		int faixa[] = { 0, 400, 800, 1200, 2000 };

		if (salario >= 0 && salario <= 120000) {
			for (int i = 1; i <= values.length - 1; i++) {

				if (salario == faixa[0]) {
					reajuste = (salario * (values[i - 1] / 100.0));
					novoSalario = reajuste + salario;
					porcent = values[0];
				}

				if (salario > (faixa[i - 1]) && salario <= faixa[i]) {
					reajuste = (salario * (values[i - 1] / 100.0));
					novoSalario = reajuste + salario;
					porcent = values[i - 1];

				}
				if (salario > faixa[4]) {
					reajuste = (salario * (values[i] / 100.0));
					novoSalario = reajuste + salario;
					porcent = values[i];

				}
			}
			scanner.close();
		}

		System.out.printf("Novo salario: %.2f\n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.printf("Em percentual: %d %%\n", porcent);

	}

}
