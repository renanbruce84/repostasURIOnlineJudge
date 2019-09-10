package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1013_OMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int MaiorAB = ((A + B + Math.abs(A-B)) / 2);
		int MaiorABC = ((C + MaiorAB + Math.abs(C - MaiorAB)) / 2);
		
		System.out.println(MaiorABC +" eh o maior");
		
		scanner.close();
		
		
		

	}

}
