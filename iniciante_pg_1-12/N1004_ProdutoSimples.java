package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1004_ProdutoSimples {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Locale.setDefault(Locale.US);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		
		int prod = A * B;
		
		System.out.println("PROD = "+prod);
		
		
	}

}
