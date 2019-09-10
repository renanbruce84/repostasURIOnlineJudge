package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1064_PositivosEMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<Double> values = new ArrayList<>();
		double somatorio = 0.0;

		for (int i = 0; i < 6; i++) {
			double n1 = scanner.nextDouble();
			if (n1 > 0) {
				values.add(n1);
			}
		}

		System.out.println(values.size()+" valores positivos");
		
		for (int i = 0; i < values.size(); i++) {
			somatorio += values.get(i);
		}
		
		double media = somatorio / values.size();		
		System.out.printf("%.1f\n",media);
		scanner.close();
		
	}

}
