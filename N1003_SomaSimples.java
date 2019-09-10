package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1003_SomaSimples {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		
		int soma = A + B;
		
		System.out.println("SOMA ="+soma);
		
	}
}
