package OhPe2021;

import java.util.Scanner;

public class KumpiSuurempi {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);
		int eka = 0, toka = 0;

		// KYSY EKA LUKU
		System.out.print("Anna eka luku: ");
		eka = lukija.nextInt();

		// KYSY TOKA LUKU
		System.out.print("Anna toka luku: ");
		toka = lukija.nextInt();

		// VERTAILE LUKUJA
		if (eka > toka) {
			System.out.println("Luvuista suurempi " + eka);

		} else if (eka == toka) {
			System.out.println("Luvut ovat yhtäsuuria");

		} else {
			System.out.println("Luvuista suurempi " + toka);
		}
		
		int kortinArvo = 11;
		
		switch (kortinArvo) {
		case 1:
			System.out.println("Kortti on Ässä.");
			break;
		case 13:
			System.out.println("Kortti on Kuningas.");
			break;
		case 12:
			System.out.println("Kortti on Rouva.");
			break;
		case 11:
			System.out.println("Kortti on Jätkä.");
			break;
		default:
			System.out.println("Kortti on väliltä 2-10.");
		}

	}

}
