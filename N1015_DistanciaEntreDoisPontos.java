package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1015_DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		double D = scanner.nextDouble();
		
		double distancia = Math.sqrt((Math.pow(C-A, 2))+(Math.pow(D-B, 2)));
		
		System.out.printf("%.4f\n",distancia);
		
		scanner.close();
	}

}
