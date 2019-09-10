package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class N1047_TempoDeJogoComMinutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int minutos = 0;
		int horas = 0;

		if ((a >= 0 && a <= 23) && (c >= 0 && c <= 23) && (b >= 0 && b <= 59) && (d >= 0 && d <= 59)) {

			// minutos
			if (b > d && b >= 0 && d >= 0) {
				minutos = (60 - b) + d;
			}
			if (b < d && b >= 0 && d >= 0) {
				minutos = d - b;
				horas = (minutos / 60);
			}
			if (b == d && b >= 0 && d >= 0) {
				minutos = 0;
				horas++;
			}

			// horas
			if ((a == c) && (a >= 0) && b > d) {
				horas = 23;
			} else if ((a == c) && (a >= 0) && (a <= 23) && b < d) {
				horas = 0;
			} else if ((a == c) && (a >= 0) && b == d) {
				horas = 24;
			}

			if (a < c && b < d) {
				horas = c - a;
			} else if (a < c && b > d) {
				horas = c - a - 1;
			} else if (a < c && b == d) {
				horas = horas + c - a;
			}

			if (a > c) {
				a = 23 - a;
				if (a <= 23 && a > 0) {
					horas = horas + a + c;
				}
			}

			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		}
		scanner.close();

	}

}
