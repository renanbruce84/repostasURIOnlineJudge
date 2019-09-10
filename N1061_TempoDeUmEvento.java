// Tempo de um Evento
package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1061_TempoDeUmEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int mes = 30;

		int dias = 0;
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		int totalSegundosGeral = 0;
		int totalSegundos1 = 0;
		int totalSegundos2 = 0;

		// dia 1
		int dia1 = scanner.nextInt();		
		int horas1 = scanner.nextInt();
		int minutos1 = scanner.nextInt();
		int segundos1 = scanner.nextInt();

		// dia 2
		int dia2 = scanner.nextInt();		
		int horas2 = scanner.nextInt();
		int minutos2 = scanner.nextInt();
		int segundos2 = scanner.nextInt();
		
		scanner.close();

		// Ocorre no período de um mês
		if ((dia1 > 0 && dia2 > 0) && (dia1 <= mes && dia2 <= mes)) {

			// segundos
			totalSegundos1 = (dia1 * 24 * 60 * 60) + (horas1 * 60 * 60) + (minutos1 * 60) + segundos1;
			totalSegundos2 = (dia2 * 24 * 60 * 60) + (horas2 * 60 * 60) + (minutos2 * 60) + segundos2;

			if (totalSegundos2 >= totalSegundos1) {

				totalSegundosGeral = totalSegundos2 - totalSegundos1;
				dias = totalSegundosGeral / (24 * 60 * 60);		
				horas = (totalSegundosGeral - (dias * 24 * 60 * 60))  / (60 * 60);				
				minutos = (totalSegundosGeral - ((dias * 24 * 60 * 60) + (horas * 60 * 60))) / (60);	
				segundos = totalSegundosGeral - ((dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60));	

			}

		}
		System.out.println(dias+" dia(s)");
		System.out.println(horas+" hora(s)");
		System.out.println(minutos+" minuto(s)");
		System.out.println(segundos+" segundo(s)");

	}

}
