package iniciante;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class N1021_NotasEMoedas {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double n = scanner.nextDouble();
		double notas[] = { 100, 50, 20, 10, 5, 2 };
		double moedas[] = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

		if (n >= 0 && n <= 1000000) {

			System.out.println("NOTAS:");
			for (int i = 0; i < notas.length; i++) {
				int calcD = (int) (n / notas[i]);
				if (i < 6) {
					System.out.printf("%d nota(s) de R$ %.2f\n", calcD, notas[i]);
				} 
				n = n % notas[i];
			}
			
			System.out.println("MOEDAS:");
			for (int i = 0; i < moedas.length; i++) {
				int calcD = (int) (n / moedas[i]);
				 
				if(i < 6) {
					System.out.printf("%d moeda(s) de R$ %.2f\n", calcD, moedas[i] );
				}
				n = n % moedas[i];
			}
		}
		scanner.close();
 
    }
 
}