package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1005_Media_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Locale.setDefault(Locale.US);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double A = Double.parseDouble(reader.readLine());
		double B = Double.parseDouble(reader.readLine());
		
		double media = ((A*3.5) + (B*7.5))/11;
		
		System.out.printf("MEDIA = %.5f\n",media);
		
		
	}

}
