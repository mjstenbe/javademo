package OhPe2021;

import java.util.Scanner;

public class kaksilukua {

	public static void main(String[] args) {

		// Luodaan lukija-muuttuja
		Scanner lukija = new Scanner(System.in);

		System.out.print("Anna eka luku: ");
		int luku1 = lukija.nextInt();

		System.out.print("Kuinka vanha olet: ");
		int luku2 = lukija.nextInt();

		int tulos = luku1 + luku2;

		System.out.println("Lukujen summa: " + tulos);

		lukija.close();
	}

}
