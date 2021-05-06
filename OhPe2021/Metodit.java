package OhPe2021;

import java.util.Scanner;

public class Metodit {

	public static void main(String[] args) {
		System.out.println("Ohjelma alkaa!");
		omaMetodi("Mika");
		omaMetodi("Maija");
		String nimi = kysyTiedot();
		System.out.println("Metodi palautti arvon: " + nimi);
		tulostaMenu(nimi);

		System.out.println("Ohjelma loppuu!");
	}

	public static String kysyTiedot() {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna nimesi: ");
		String nimi = lukija.nextLine();
		return nimi;
	}

	public static void omaMetodi(String etunimi) {
		System.out.println("Tervehdys " + etunimi + " omasta metodista!");

	}

	public static void tulostaMenu(String etunimi) {
		System.out.println(" Tervetuloa " + etunimi);
		System.out.println("****************************");
		System.out.println("* 1 - Käynnistä auto 	   *");
		System.out.println("* 2 - Sammuta  auto 	   *");
		System.out.println("* 3 - Lopeta ohjelma       *");
		System.out.println("****************************");
	}

}
