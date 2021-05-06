package OhPe2021;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		// Luodaan tarvittavat vakiot
		double kg = 0;
		double pituus = 0;

		// Luodaan tarvittavat muuttujat
		double painoindeksi = 0;

		// Luodaan tarvittavat oliot
		Scanner arvo = new Scanner(System.in);

		// Ohjelma alkaa
		System.out.print("paljonko sinä painat (kg): ");
		kg = arvo.nextDouble();

		System.out.print("Paljonko olet pitkä (m): ");
		pituus = arvo.nextDouble();

		// Laskukaava
		painoindeksi = kg / Math.pow(pituus, 2);
		System.out.println("Painoindeksinne on " + painoindeksi);
		System.out.printf("Painoindeksinne on %.3f \n", painoindeksi);
		System.out.printf("Painat %5.0f kiloa, olet %8.2f pitkä ja painoindeksinne on %9.3f \n", kg, pituus,
				painoindeksi);

		
	}
}
