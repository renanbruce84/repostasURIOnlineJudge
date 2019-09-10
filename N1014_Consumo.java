package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1014_Consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt();//distancia em Km
		double Y = scanner.nextDouble();//valor gasto gasolina
		
		double KmPorLitro = X / Y;
		
		System.out.printf("%.3f km/l\n", KmPorLitro);
		
		scanner.close();
		
		
	}

}
