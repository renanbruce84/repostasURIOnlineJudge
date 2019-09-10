package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1066_ParesImparesPositivosENegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		int positivos = 0;
		int negativos = 0;

		List<Integer> values = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			values.add(scanner.nextInt());

			if (values.get(i) % 2 == 0) {
				par++; 
			}else {
				impar++;
			}
			
			if(values.get(i) > 0) {
				positivos++;
			}
			if(values.get(i) < 0 ) {
				negativos++;
			}

		}

		System.out.printf("%d valor(es) par(es)\n", par);
		System.out.printf("%d valor(es) impar(es)\n", impar);
		System.out.printf("%d valor(es) positivo(s)\n", positivos);
		System.out.printf("%d valor(es) negativo(s)\n", negativos);
		
		scanner.close();

	}

}
