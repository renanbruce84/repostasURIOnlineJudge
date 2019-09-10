package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class N1001_ExtremelyBasic {
	
	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int A, B, X;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		X = A + B;
		
		System.out.println("X = "+X);
				
		scanner.close();
		
	}

}