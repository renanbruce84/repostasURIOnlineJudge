package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1052_Mes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int mo = scanner.nextInt();
		
		String meses[] = {"January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};

		if(mo > 0 && mo <= 12) {
			System.out.println(meses[--mo]);
		}
		scanner.close();
	}

}
