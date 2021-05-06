package OhPe2021;
import java.util.Scanner;
public class karvo {
  
		public static void main(String[] args) {

			// Luodaan lukija-muuttuja
			Scanner lukija = new Scanner(System.in);

			System.out.print("Anna eka luku: ");
			double luku1 = lukija.nextDouble();

			System.out.print("Anna toka: ");
			double luku2 = lukija.nextDouble();

			System.out.print("Anna kolmas: ");		
			double luku3 = lukija.nextDouble();
			
			double summa = luku1 + luku2 + luku3;
			double ka = summa / 3;

			System.out.println("Lukujen ka: " + ka);

			lukija.close();
		}

	}
