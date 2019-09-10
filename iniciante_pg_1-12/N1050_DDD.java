package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1050_DDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int values = scanner.nextInt();
		boolean verifica = false;
		scanner.close();

		int ddd[] = { 61, 71, 11, 21, 32, 19, 27, 31 };
		String destination[] = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas",
				"Vitoria", "Belo Horizonte" };

		for (int i = 0; i < ddd.length; i++) {
			if (ddd[i] == values) {
				System.out.println(destination[i]);
				verifica = true;
				break;
			}
		}
		
		if(verifica == false){
			System.out.println("DDD nao cadastrado");
		}
	}

}
