package OhPe2021;

import java.util.Scanner;

public class Lukemista {

	public static void main(String[] args) {

		// Luodaan lukija-muuttuja
		Scanner lukija = new Scanner(System.in);
		Scanner nlukija = new Scanner(System.in);

		System.out.print("Mikä on nimesi: ");
		String nimi = lukija.nextLine();

		System.out.print("Kuinka vanha olet: ");
		int ika = nlukija.nextInt();

		System.out.print("Mikä on osoitteesi: ");
		String osoite = lukija.nextLine();

		System.out.println("Terve " + nimi + "! Olet " + ika + " vuotta vanha.");

		lukija.close();
	}

}
