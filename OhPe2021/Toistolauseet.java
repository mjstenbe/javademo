package OhPe2021;

import java.util.Scanner;

public class Toistolauseet {

	public static void main(String[] args) {
		
		int luku1 = 10, luku2 = 2;
		// Lasketaan tulos ensin muuttujaan
		int tulos = luku1 % luku2;
		// Jos haluat tulostaa %-merkin, niin printf vaatii ett‰ kirjoitat kaksi %% merkki‰
		// huomaa, ett‰ koska modulo operaattori tuottaa kokonaisluvun, joudut muotoilemaan tuloksen k‰ytt‰en %d
		// merkint‰‰. Desimaaleja ei ole, siksi siihen ei tule .1d vaan pelkk‰ %d
		System.out.printf(luku1+" %% "+luku2+" =  %d \n", tulos); 
		
		System.out.println( Math.pow(2,2) );

		for (int i=0; i < 10; i++) {
			System.out.println("Jippii");
		}
		
		Scanner lukija = new Scanner(System.in);
		
		int pin = 0;
		do {
			System.out.println("Anna PIN-koodi");
			pin = lukija.nextInt();
		} while (pin != 3210);

	
		int pin2 = 3210;	
		while (pin2 != 3210) {
			System.out.println("Anna PIN-koodi");
			pin2 = lukija.nextInt();
		}
		
		
		int i = 10;
		while (i < 5) {
			System.out.println("Hoi Maailma " + i);
			i++;
		}

//		int laskuri = 0;
//		do {
//			System.out.println("Hoi Maailma! " + laskuri);
//			laskuri++;
//
//			if (laskuri == 5000) {
//				break;
//			}
//
//		} while (true);

		lukija.close();
	}

}
