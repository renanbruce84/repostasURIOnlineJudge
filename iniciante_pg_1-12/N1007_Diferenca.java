package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1007_Diferenca {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(reader.readLine());
		int B = Integer.parseInt(reader.readLine());
		int C = Integer.parseInt(reader.readLine());
		int D = Integer.parseInt(reader.readLine());
		
		int diferenca = (A*B)-(C*D);
		
		System.out.println("DIFERENCA = "+diferenca);
		
		
				

	}

}
