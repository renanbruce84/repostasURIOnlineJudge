package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1006_Media_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Locale.setDefault(Locale.US);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double A = Double.parseDouble(reader.readLine());
		double B = Double.parseDouble(reader.readLine());
		double C = Double.parseDouble(reader.readLine());
		
		double media = ((A*2)+(B*3)+(C*5))/10;
		System.out.printf("MEDIA = %.1f",media);
	}
	
}
