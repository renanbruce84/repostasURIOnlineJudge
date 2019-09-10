package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1002_AreaOfACircle {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		double pi = 3.14159;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double raio = Double.parseDouble(in.readLine());
		double area = pi * Math.pow(raio, 2);
		System.out.printf("A=%.4f\n",area);
		
	}

}
