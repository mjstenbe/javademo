package OhPe2021;

public class Karkausvuosi {

	public static void main(String[] args) {

		int vuosi = 2000;

		// Karkausvuosia ovat kaikki 400:lla jaolliset vuodet

		if (vuosi % 400 == 0 || (vuosi % 4 == 0 && vuosi % 100 != 0)) {
			System.out.println("Oli karkausvuosi!");
		}

		else {
			System.out.println("Ei ollut karkausvuosi.");
		}

	}

}
