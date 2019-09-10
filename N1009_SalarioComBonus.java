package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1009_SalarioComBonus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//String nome = reader.readLine().toString();
		double fixo = Double.parseDouble(reader.readLine());
		double mes = Double.parseDouble(reader.readLine());
		
		double salario = fixo +(mes*.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", salario);
		

	}

}
