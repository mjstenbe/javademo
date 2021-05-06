package OhPe2021;

public class Toistoa2 {

	public static void main(String[] args) {

		int luku = 15;

		do {
			System.out.println("Luku oli: " + luku);
			luku--;
		} while (luku > 0);

		while (luku > 0) {
			System.out.println("Luku oli: " + luku);
			luku--;
		}

		while (luku <= 20) {
			System.out.println("Luku oli: " + luku);
			luku++;
		}

		if (luku <= 21) {
			System.out.println("Luku oli: " + luku);
		}

	}

}
