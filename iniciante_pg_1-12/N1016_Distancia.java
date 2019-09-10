package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1016_Distancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int carroX = 60;
		int carroY = 90;
		
		int distancia = scanner.nextInt();
		
		int calculatempo = (60 * distancia) / (carroX - carroY);
		
		System.out.println(calculatempo);
		
		scanner.close();
		
		

	}

}
