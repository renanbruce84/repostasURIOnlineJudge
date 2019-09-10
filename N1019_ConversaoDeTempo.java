package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1019_ConversaoDeTempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();//segundos
		int values[] = { 3600, 60, 1 };
		Integer calSeg[] = new Integer[3];

		for (int i = 0; i < values.length; i++) {
			calSeg[i] = n / values[i];
			n = n % values[i];
		}
		System.out.println(calSeg[0] + ":" + calSeg[1] + ":" + calSeg[2]);
		scanner.close();

	}

}
