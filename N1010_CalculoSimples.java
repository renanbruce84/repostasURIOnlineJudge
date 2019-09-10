package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1010_CalculoSimples {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String peca1 = reader.readLine().toString();
		String peca2 = reader.readLine().toString();

		String arrayPeca1[] = peca1.split(" ");
		String arrayPeca2[] = peca2.split(" ");

		//int cod1 = Integer.parseInt(arrayPeca1[0]);
		int num1 = Integer.parseInt(arrayPeca1[1]);
		double valor1 = Double.parseDouble(arrayPeca1[2]);

		//int cod2 = Integer.parseInt(arrayPeca2[0]);
		int num2 = Integer.parseInt(arrayPeca2[1]);
		double valor2 = Double.parseDouble(arrayPeca2[2]);

		double total = (num1 * valor1) + (num2 * valor2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

	}

}
