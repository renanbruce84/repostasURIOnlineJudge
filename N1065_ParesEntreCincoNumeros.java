package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1065_ParesEntreCincoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> value = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			
			int n1 = scanner.nextInt();
			if (n1 % 2 == 0) {
				value.add(n1);
			}
		}
		
		System.out.printf("%d valores pares\n",value.size());
		scanner.close();
	}

}
