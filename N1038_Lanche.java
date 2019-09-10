package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1038_Lanche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int cod = scanner.nextInt();
		int quant = scanner.nextInt();
		double N = 0;
		
		switch (cod) {
		case 1:
			N = (quant * 4.0);
			break;
		case 2:
			N = (quant * 4.5);
			break;
		case 3:
			N = (quant * 5.0);
			break;
		case 4:
			N = (quant * 2.0);
			break;
		case 5:
			N = (quant * 1.5);
			break;
		}
		System.out.printf("Total: R$ %.2f\n", N);
		scanner.close();
	}

}
