package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1011_Esfera {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double raio = Double.parseDouble(reader.readLine());
		
		double volume = (4.0/3) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f\n",volume);
		
		
	}

}
