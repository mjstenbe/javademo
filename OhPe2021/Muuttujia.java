package OhPe2021;

public class Muuttujia {

	static String etunimi = "Mika";

	public static void main(String[] args) {

//		•     kokonaislukutaulukko (int), jossa on 5 alkiota; 
		// alusta alkiot arvoilla 5, 7, 32, 31, 8

		int[] kokonaislukutaulukko = { 5, 7, 32, 31, 8 };

		int[] kokonaislukutaulukko2 = new int[5];
		kokonaislukutaulukko[0] = 5;
		kokonaislukutaulukko[1] = 7;
		kokonaislukutaulukko[2] = 32;
		kokonaislukutaulukko[3] = 31;
		kokonaislukutaulukko[4] = 8;

		System.out.println("Taulukon koko: " + kokonaislukutaulukko.length);
		System.out.println("Taulukon eka alkio: " + kokonaislukutaulukko[0]);
		System.out.println("Taulukon vika alkio: " + kokonaislukutaulukko[kokonaislukutaulukko.length - 1]);

		// • desimaalilukutaulukko (double), jossa on 3 alkiota; alusta alkiot arvoilla
		// 12.4 -13.55 ja 67.44

		double[] desimaalilukutaulukko = { 12.4, -13.55, 67.44 };

//		•     merkkijonotaulukko (String), jossa on 4 alkiota; alusta alkiot arvoilla Helsinki, Lissabon, 
//		New York, Shanghai

		String[] merkkijonotaulukko = { "Helsinki", "Lissabon", "New York", "Shanghai" };
		char merkki = 'M';
		char[] merkit = { 'K', 'm', 'L' };

//		a) Tulosta ruudulle lause ”Alkiossa numero 3 on : ” ja liitä perään merkkijonotaulukon kolmas alkio
		System.out.println("Alkiossa numero 3 on : " + merkkijonotaulukko[2]);

//		b) Tulosta ruudulle lause ”Alkiossa numero 5 on : ” ja liitä perään kokonaislukutaulukon viides alkio
//		c) Tulosta ruudulle lause ”Desimaalitaulukossa on XX arvoa”, jossa liität XX:n perään ko. taulukon pituuden kertovan kentän nimen
//
//		d) Kirjoita kokonaislukutaulukkoa varten for-lause, jolla tulostat taulukon sisällön ruudulle

		for (int i = 0; i < kokonaislukutaulukko.length; i++) {
			System.out.println(kokonaislukutaulukko[i]);
		}

		int i = 0;
		while (i < kokonaislukutaulukko.length) {
			System.out.println(kokonaislukutaulukko[i++]);
		}

//		e) Kirjoita desimaalilukutaulukkoa varten for –lause, jolla tulostat taulukon viimeisestä alkiosta ensimmäiseen (eli käänteisessä järjestyksessä)

		for (int j = desimaalilukutaulukko.length - 1; j >= 0; j--) {
			System.out.println(desimaalilukutaulukko[j]);
		}

		// f) Kirjoita merkkijonotaulukkoa varten do-while – silmukka, jolla käyt läpi
		// kaikki alkiot ja asetat niiden arvoksi tekstin ”Tyhjä”.

		for (int i1 = 0; i1 < merkkijonotaulukko.length; i1++) {
			System.out.println(merkkijonotaulukko[i1]);
		}

		int k = 0;
		do {
			merkkijonotaulukko[k++] = "Tyhjä";
		} while (k < merkkijonotaulukko.length);
//
		for (int i1 = 0; i1 < merkkijonotaulukko.length; i1++) {
			System.out.println(merkkijonotaulukko[i1]);
		}

		int[] lukuTaulu = { 55, 23, 6456, 324, 21, 234, 72, 21 };
		String[] nimiTaulu = { "Petteri", "Kauko", "Matti", "Minna", "Maisa", "Juuso", "Mauno" };

		int haettava = 21;
		for (int j = 0; j < lukuTaulu.length; j++) {
			if (lukuTaulu[j] == 21) {
				System.out.println("Löytyi indeksistä " + j);

			}
		}

		String etsittava = "Matti";
		etsittava.toLowerCase();
		for (int j = 0; j < nimiTaulu.length; j++) {
			if (nimiTaulu[j].equals(etsittava)) {
				System.out.println("Löytyi indeksistä " + j);

			}
		}

	}

}
