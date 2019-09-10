package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1017_GastoDeCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double klm = 12;
		
		int tempo = scanner.nextInt();
		int vm = scanner.nextInt();
		
		double litros = (tempo * vm) / klm;
		
		System.out.printf("%.3f\n", litros);
		scanner.close();
	}

}
