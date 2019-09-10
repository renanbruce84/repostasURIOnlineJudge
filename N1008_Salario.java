package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class N1008_Salario {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int numero = Integer.parseInt(reader.readLine());
		int horas = Integer.parseInt(reader.readLine());
		double salario = Double.parseDouble(reader.readLine());
		
		double calculoSalario = horas * salario;
		
		System.out.println("NUMBER = "+numero);
		System.out.printf("SALARY = U$ %.2f\n", calculoSalario);
		
		
	}

}
