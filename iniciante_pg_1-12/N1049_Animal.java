package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class N1049_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		List<String> values = new ArrayList<>();
		String animal = "";

		for (int i = 0; i < 3; i++) {
			values.add(scanner.nextLine());
		}

		scanner.close();

		if (values.get(0).equals("vertebrado")) {
			if (values.get(1).equals("ave")) {
				if (values.get(2).equals("carnivoro")) {
					animal = "aguia";
				} else if (values.get(2).equals("onivoro")) {
					animal = "pomba";
				}
			}
			if (values.get(1).equals("mamifero")) {
				if (values.get(2).equals("onivoro")) {
					animal = "homem";
				} else if (values.get(2).equals("herbivoro")) {
					animal = "vaca";
				}
			}
		}

		if (values.get(0).equals("invertebrado")) {

			if (values.get(1).equals("inseto")) {
				if (values.get(2).equals("hematofago")) {
					animal = "pulga";
				} else if (values.get(2).equals("herbivoro")) {
					animal = "lagarta";
				}
			}
			if (values.get(1).equals("anelideo")) {
				if (values.get(2).equals("hematofago")) {
					animal = "sanguessuga";
				} else if (values.get(2).equals("onivoro")) {
					animal = "minhoca";
				}
			}
		}

		System.out.println(animal);
	}

}
